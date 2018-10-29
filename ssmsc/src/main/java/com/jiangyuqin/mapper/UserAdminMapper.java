package com.jiangyuqin.mapper;

import com.jiangyuqin.model.UsrAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Repository
public interface UserAdminMapper {

    List<UsrAdmin> getUser(@Param("param") Map map);

    void insertUser(@Param("param") Map param);

    List<UsrAdmin> selectAll();

    void update(@Param("param") Map param);

}
