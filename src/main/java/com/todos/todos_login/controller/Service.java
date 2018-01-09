package com.todos.todos_login.controller;



import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/****** INFO ***********************************************
 * 업 무 명 : 
 * 작 성 자 : LEE BYEONG MOO
 * 작 성 일 : 2018-01-09
 * 수 정 자 : 
 * 수 정 일 : 
 * 내    용 : 
 * 주의사항 : 
 ************************************************************/
@Mapper
public interface Service {

    List<Map<String,Object>> list(Map<String,Object> param);
}
