package com.hd.epac.service;

import com.hd.epac.dao.UserDao;
import com.hd.epac.entity.User;
import com.hd.epac.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: epac
 * @description:
 * @author: Mr.Shi
 * @create: 2019-03-19 00:48
 **/
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public ResultUtil login(User user) {
        User u = new User();
        List<User> list = new ArrayList<>();
        list = userDao.login(user);
        ResultUtil resultUtil = new ResultUtil();
        if (list.size() != 0) {
            resultUtil.setCode(0);
            resultUtil.setMsg("登陆成功！");
            resultUtil.setList(list);
            resultUtil.setObject(list.get(0));
        } else {
            resultUtil.setCode(1);
            resultUtil.setMsg("登录失败！");
        }
        return resultUtil;
    }
}
