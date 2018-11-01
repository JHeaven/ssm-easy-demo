package com.jiangyuqin.service;

import com.jiangyuqin.model.UsrAdmin;

import java.util.List;

/**
 *
 */
public interface IUserService {



    List<UsrAdmin> getUser(String dacc);

    Integer insertUser(String name);

    List<UsrAdmin> selectAll();

    Integer update();
}
