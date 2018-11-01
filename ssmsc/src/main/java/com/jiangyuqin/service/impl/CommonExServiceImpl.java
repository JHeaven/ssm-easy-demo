package com.jiangyuqin.service.impl;

import com.jiangyuqin.mapper.CommonExMapper;
import com.jiangyuqin.service.ICommonExService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class CommonExServiceImpl implements ICommonExService{

    @Resource
    private CommonExMapper commonExMapper;

    @Override
    public List<LinkedHashMap<String, Object>> commonQuery(String sqlStr) {
        return commonExMapper.commonQuery(sqlStr);
    }

    @Override
    public Integer commonUpdate(String sqlStr) {
        return commonExMapper.commonUpdate(sqlStr);
    }

    @Override
    public Integer commonDelete(String sqlStr) {
        return commonExMapper.commonDelete(sqlStr);
    }
}
