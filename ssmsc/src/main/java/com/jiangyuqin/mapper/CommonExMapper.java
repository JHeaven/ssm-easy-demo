package com.jiangyuqin.mapper;

import java.util.LinkedHashMap;
import java.util.List;

public interface CommonExMapper {

    List<LinkedHashMap<String,Object>> commonQuery(String sqlStr);

    Integer commonUpdate(String sqlStr);

    Integer commonDelete(String sqlStr);
}
