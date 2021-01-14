package springboot.service.Impl;

import springboot.mybatis.mapper.TblRoleMapper ;
import springboot.mybatis.mapper.TblUserMapper;
import springboot.mybatis.mapper.TblUserRoleMapper;
import springboot.mybatis.po.TblRole;
import springboot.mybatis.po.TblUser;
import springboot.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.service.MyUserDetailsService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MyUserDetailsServiceImpl implements MyUserDetailsService {
    @Autowired
    HttpServletRequest request;
    @Autowired
    private TblRoleMapper tblRoleMapper;
    @Autowired
    private TblUserMapper tblUserMapper;
    @Autowired
    private TblUserRoleMapper tblUserRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TblUser tblUser = tblUserMapper.selectUserByloginName(username);
        TblRole tblRole = tblRoleMapper.selectRoleName(username);
        //tblUser.setPassword(passwordEncoder.encode(tblUser.getPassword()));
        try {
            if (tblUser == null) {
                return null;
            }
            List<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_"+tblRole.getRoleName()));
            return new User(tblUser.getLoginName(), tblUser.getPassword(), authorities);
        } catch (Exception e) {
            e.printStackTrace();
            //认证失败
            return null;
        }
    }

}
