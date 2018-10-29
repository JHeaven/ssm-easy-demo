package com.jiangyuqin.service.impl;

import com.jiangyuqin.mapper.UserAdminMapper;
import com.jiangyuqin.model.UsrAdmin;
import com.jiangyuqin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserAdminMapper userMapper;

    @Override
    public List<UsrAdmin> getUser(String dacc) {
        Map map = new HashMap();
        map.put("dacc",dacc);
        return userMapper.getUser(map);
    }

    @Override
    public Integer insertUser(int id, String name, int age, String sex) {
        return null;
    }

    @Override
    public List<UsrAdmin> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public Integer update() {
        return null;
    }
}
