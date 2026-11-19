package com.skyllx.firstwebapplication.controller;

import com.skyllx.firstwebapplication.service.AuthenticateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(names="username")
public class LoginController {
    @Autowired
    private AuthenticateService authenticateService;
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

//    @RequestMapping("/login")
//    public String login(@RequestParam String name, ModelMap mapper)
//    {
//        logger.info("request reached the method");
//        mapper.put("name",name);
//        logger.debug(name);
//        return "login";
//
//    }

    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login()
    {

        return "login";

    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String welcome(@RequestParam String username, @RequestParam String password, ModelMap mapper)

    {
        mapper.put("username",username);
        mapper.put("password",password);
      if(authenticateService.authenticate(username,password)){
          mapper.put("username", username);
          return "welcome";

      }
      else {
          return "login";
      }



    }

}


//http:localhost:8080/login
// http://localhost:8080/login?name=megha
//along with request parameters are coming we can collect it by using requestparam
//String datatype because it is capable to handle every data
//we can access the value using ${keyname} like ${name}
//protected memebers can be accesed outside the clss
// You write this in LoginController because you want to create a logger for your own class,
// so you can print logs like logger.info(...), logger.debug(...), etc.
//to control the log level only for your application code(logging.level.com.skyllx.firstwebapplication)
// — including the logs coming from your LoginController.
// dependency-if we want use jstl we need 2 dependencies(jspjstl,glassfish)
//jsp is not saficient for that we are using jstl
//webjar(instead of bootstrap)-with depencies with version-in dependency change the version
//