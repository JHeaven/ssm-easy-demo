package com.jiangyuqin.service;

import java.util.LinkedHashMap;
import java.util.List;

public interface ICommonExService {

    List<LinkedHashMap<String,Object>> commonQuery(String sqlStr);

    Integer commonUpdate(String sqlStr);

    Integer commonDelete(String sqlStr);
}
