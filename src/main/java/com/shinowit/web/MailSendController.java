package com.shinowit.web;

import com.shinowit.util.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping(value = "/user")
public class MailSendController {

    @Resource
    private Email el;

    @RequestMapping(value = "/show")
    public void sendtoemail(@RequestParam("senemail")String email,HttpServletRequest request){

        String ss=request.getSession(true).getId();
        String url="http://localhost:8080/html/login.jsp?url="+ss;
        el.sendMail("账户激活",url,email);
    }

}
