package com.dcool.demo.controller;

import com.dcool.demo.domain.UserInfo;
import com.dcool.demo.service.UserService;
import com.dcool.demo.util.UserThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author oneTi
 * @Description: TODO
 * @date 2018/8/613:36
 */
@Controller
public class UserController extends BaseController {

    @Autowired
    UserService userService;

    @RequestMapping("/welcome")
    public String welcome(HttpServletRequest request)
    {
        return "welcome";
    }

    @RequestMapping("/user/login")
    public String login(String userName, String password)
    {
        UserInfo userInfo = userService.findUserInfoByUserName(userName);
        request.getSession().setAttribute("userInfo", userInfo); //将用户信息保存到session
        return "usercontent";
    }

    /**
     * @Description //添加用户
     * @Param [user]
     * @Author oneTi
     * @Date 9:15 2018/8/8
     * @Return java.lang.String
     **/
    @RequestMapping("/user/add")
    public String addUser(UserInfo user)
    {
        userService.addUser(user);
        return "redirect:/welcome"; //redirect :重定向，否者跳转的地址将成为127.0.0.1:8080/user/add
    }

    /**
     * @Description //按姓名删除用户
     * @Param [name]
     * @Author oneTi
     * @Date 9:16 2018/8/8
     * @Return java.lang.String
     **/
    @RequestMapping("/user/delete/{name}")
    public String deleteUser(@PathVariable("name") String name)
    {
        userService.deleteUserByName(name);
        return "welcome";
    }

    /**
     * @Description //按姓名查找用户
     * @Param [name]
     * @Author oneTi
     * @Date 9:17 2018/8/8
     * @Return java.lang.Boolean
     **/
    @RequestMapping("/user/find/")
    @ResponseBody
    public Boolean isExistUser(String userName)
    {
        if(userService.findUserInfoByUserName(userName) != null)
        {
            return false;
        }
        return true;
    }

    /**
     * @Description //根据用户名和密码检查用户是否存在
     * @Param [userName, password]
     * @Author oneTi
     * @Date 15:21 2018/8/10
     * @Return java.lang.Boolean
     **/
    @RequestMapping("/user/check")
    @ResponseBody
    public Boolean checkUserByNameAndPassword(String userName, String password)
    {
        if(userService.findUserInfoByUserNameAndPassword(userName, password) != null)
        {
            return true;
        }
        return false;
    }

    @RequestMapping("/user/status")
    @ResponseBody
    public UserInfo checkUserStatus()
    {
        if(UserThreadLocalUtil.getUser() != null)
        {
            System.out.println("UserController-->>>checkUserStatus()" + UserThreadLocalUtil.getUser());
            return UserThreadLocalUtil.getUser();
        }
        return null;
    }
}
