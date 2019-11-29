package com.example.demo;

import com.example.demo.Result.Result;
import com.example.demo.Result.ResultUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DemoController
 * @Description TODO:
 * @date 2019/11/29 13:41
 **/

@RestController
public class DemoController {

    /**
     * 登录
     * @Description
     * @param username 登录名
     * @param password 密码
     * @param type 0 代表客户端 1 代表后台管理系统
     * @date
     * @return
     */
    @ResponseBody
    @PostMapping("/demo")
    public Result login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam("type") Integer type) {
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("LOGINTOKEN", "12312312321");
        User user = new User();
        user.setPassword("123");
        user.setUsername("user");
        mapData.put("user", user);
        return ResultUtil.success(mapData);
    }


    /**
     * 删除角色
     * @Description
     * @date
     * @return
     */
    @ResponseBody
    @PostMapping("/demo2")
    public Result deleteRole() {
        return ResultUtil.success();
    }
}
