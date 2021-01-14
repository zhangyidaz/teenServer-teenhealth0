package springboot.service;

import springboot.mybatis.po.TblUser;


public interface UserService {
    //根据管理员用户姓名查询用户信息
    public TblUser selectUserByloginName(String loginName);
}
