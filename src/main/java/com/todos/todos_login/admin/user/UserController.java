package com.todos.todos_login.admin.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
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
@Controller
public class UserController {

    @Autowired
    User service;

    @RequestMapping(value="/hello")
    public String Hello(Model model){
        Map<String,Object> param = new HashMap<>();
        List<Map<String,Object>> result =  service.list(param);

        System.out.print(result);

        model.addAttribute("result",result);
        model.addAttribute("name","jaehoon");
        return "hello";
    }

}
