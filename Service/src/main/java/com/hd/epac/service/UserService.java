package com.hd.epac.service;

import com.hd.epac.entity.User;
import com.hd.epac.util.ResultUtil;

/**
* @Description:
* @Param:
* @return:
* @Author: Mr.Shi
* @Date: 2019/3/19
*/
public interface UserService {
    ResultUtil login(User user);
}
