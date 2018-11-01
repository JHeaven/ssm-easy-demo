package com.jiangyuqin.service.impl;

import com.jiangyuqin.mapper.CommonExMapper;
import com.jiangyuqin.mapper.UsrAdminMapper;
import com.jiangyuqin.model.UsrAdmin;
import com.jiangyuqin.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UsrAdminMapper usrMapper;

    @Resource
    private CommonExMapper commonExMapper;

    @Override
    public List<UsrAdmin> getUser(String dacc) {
        UsrAdmin usrAdmin = new UsrAdmin();
        usrAdmin.setUuid("1");
        return usrMapper.select(usrAdmin);
    }

    @Override
    public Integer insertUser(String name) {
        UsrAdmin usrAdmin = new UsrAdmin();
        usrAdmin.setUuid(UUID.randomUUID().toString().replace("-", ""));
        usrAdmin.setDacc(name);
        usrAdmin.setDpwd("pwd:"+name);
        usrAdmin.setNickname(name);
        usrAdmin.setLastlogin(new Date());
        usrAdmin.setYxbz("Y");
        return usrMapper.insert(usrAdmin);
    }

    @Override
    public List<UsrAdmin> selectAll() {
        List<LinkedHashMap<String, Object>> linkedHashMaps = commonExMapper.commonQuery("SELECT COUNT(1) FROM Z_USR_ADMIN");
        System.out.println("COMMON:"+linkedHashMaps.size());
        return usrMapper.selectAll();
    }

    @Override
    public Integer update() {
        return null;
    }
}
