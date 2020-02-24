package com.engine.foodfunengine.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface testMapper {
	//@Insert("insert into test_temp (name) values (#{path})")
	//void testAdd(@Param("path") String path);

}
