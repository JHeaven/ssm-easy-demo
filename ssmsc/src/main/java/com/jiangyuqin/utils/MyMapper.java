package com.jiangyuqin.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 基础 mapper
 * 不可被扫描到
 * BaseMapper<T>
 * MySqlMapper<T>
 * IdsMapper<T>
 * ConditionMapper<T>
 * ExampleMapper<T>
 * @param <T>
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {

}
