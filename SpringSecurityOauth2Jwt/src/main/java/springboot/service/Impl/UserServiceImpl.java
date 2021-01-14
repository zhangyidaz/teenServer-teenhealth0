package springboot.service.Impl;

import springboot.mybatis.mapper.TblUserMapper;
import springboot.mybatis.po.TblUser;
import springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired private TblUserMapper tblUserMapper;

    @Override
    public TblUser selectUserByloginName(String loginName){
        return tblUserMapper.selectUserByloginName(loginName);
    }

}
