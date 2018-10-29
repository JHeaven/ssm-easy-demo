package com.jiangyuqin.service;

import com.jiangyuqin.model.UsrAdmin;

import java.util.List;

/**
 *
 */
public interface IUserService {
    List<UsrAdmin> getUser(String dacc);

    Integer insertUser(int id, String name, int age, String sex);

    List<UsrAdmin> selectAll();

    Integer update();
}
