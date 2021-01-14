package teenhealth.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
//@EnableWebSecurity
//@EnableResourceServer
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
    @Override
    protected void configure(HttpSecurity http)throws Exception{
        //定制请求授权规则,配置路径和访问角色
        http.csrf().disable()
                .authorizeRequests()//.antMatchers("/userlogin").permitAll()
                .antMatchers("/teacher/**").hasRole("USER")
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginPage("/userlogin")
                .failureUrl("/login?error")
                .defaultSuccessUrl("/teacher/homepage");
//                .and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);

//        //开启自动配置的注销功能
//        http.logout().logoutUrl("/logout").logoutSuccessUrl("/userlogin"); //注销成功后返回主页
//        //开启记住登录功能,过期时间60s
        http.rememberMe().tokenRepository(persistentTokenRepository())  //开启持久化token
                .rememberMeParameter("rememberMe").tokenValiditySeconds(60);

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/css/**","/font/**","/img/**","/js/**","/assets/**");
//        /**/*.js","/**/*.css","/**/*.jpg","/**/*.png","/**/*.gif","/**/*.ttf","/**/*.eot","/**/*.woff
        //  "/static/css/**","/font/**","/img/**","/js/**","/assets/**"

    }
//    //配置身份管理器 密码加密
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(myUserDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
//    }
//
    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource); // 设置数据源
//        tokenRepository.setCreateTableOnStartup(true); // 启动创建表，创建成功后注释掉
        return tokenRepository;
    }

}
