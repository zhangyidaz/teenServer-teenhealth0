package springboot.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import springboot.service.Impl.MyUserDetailsServiceImpl;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService myUserDetailsService(){
        return new MyUserDetailsServiceImpl();
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Autowired
    private DataSource dataSource;

    //身份验证管理器
    @Bean
    public AuthenticationManager authenticationManagerBean()throws Exception{
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http)throws Exception{
        http.csrf().disable().cors().and()
//                .requestMatchers()
//                .antMatchers("/userlogin")
//                .and()
                .authorizeRequests()
                .antMatchers("/userlogin").permitAll()
                .antMatchers("/tph/**").permitAll()
//                .antMatchers("/teacher/**").hasRole("USER")
                .antMatchers(HttpMethod.OPTIONS)//跨域请求会先进行一次options请求
                .permitAll()
                .and()
                .formLogin()
                .loginPage("/userlogin")
                .failureUrl("/loginError")
//                .failureUrl("/login?error")
//                .defaultSuccessUrl("/teacher/homepage")
                .defaultSuccessUrl("/loginSuccess")
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);
        //开启自动配置的注销功能
        http.logout().logoutUrl("/logout").logoutSuccessUrl("/login"); //注销成功后返回主页
        //开启记住登录功能,过期时间60s
        http.rememberMe().tokenRepository(persistentTokenRepository())  //开启持久化token
                .rememberMeParameter("rememberMe").tokenValiditySeconds(60*60);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/css/**","/font/**","/img/**","/js/**","/assets/**");
//        /**/*.js","/**/*.css","/**/*.jpg","/**/*.png","/**/*.gif","/**/*.ttf","/**/*.eot","/**/*.woff
        //  "/static/css/**","/font/**","/img/**","/js/**","/assets/**"

    }
    //配置身份管理器 密码加密
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource); // 设置数据源
//        tokenRepository.setCreateTableOnStartup(true); // 启动创建表，创建成功后注释掉
        return tokenRepository;
    }

}
