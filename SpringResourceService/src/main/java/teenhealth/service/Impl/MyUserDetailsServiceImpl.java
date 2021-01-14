package teenhealth.service.Impl;

import teenhealth.mybatis.mapper.TblRoleMapper;
import teenhealth.mybatis.mapper.TblUserMapper;
import teenhealth.mybatis.mapper.TblUserRoleMapper;
import teenhealth.mybatis.po.TblRole;
import teenhealth.mybatis.po.TblUser;
import teenhealth.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
