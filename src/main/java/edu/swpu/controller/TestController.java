package edu.swpu.controller;

import com.alibaba.fastjson.JSON;
import edu.swpu.domain.User;
import edu.swpu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {
    @Resource
    private UserService userService;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        User user = new User();
        user.setId(1);
        try {
            List<User> users = userService.selectEntryList(user);
            return JSON.toJSONString(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
