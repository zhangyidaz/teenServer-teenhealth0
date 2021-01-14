package teenhealth.service.Impl;

import teenhealth.service.UserService;
import teenhealth.mybatis.mapper.TblUserMapper;
import teenhealth.mybatis.po.TblUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired private TblUserMapper tblUserMapper;

    @Override
    public TblUser selectUserByloginName(String loginName){
        return tblUserMapper.selectUserByloginName(loginName);
    }

}
