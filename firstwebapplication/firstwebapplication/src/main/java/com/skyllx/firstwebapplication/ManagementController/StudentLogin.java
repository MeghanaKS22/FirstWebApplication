//package com.skyllx.firstwebapplication.ManagementController;
//
//import com.skyllx.firstwebapplication.ManagementService.ManagementService;
//import com.skyllx.firstwebapplication.controller.LoginController;
//import com.skyllx.firstwebapplication.service.AuthenticateService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//
//
//
//    @Controller
//    @SessionAttributes("username")
//    public class StudentLogin {
//        @Autowired
//        private ManagementService managementService;
//        private static final Logger logger = LoggerFactory.getLogger(StudentLogin.class);
//
//
//
//        @RequestMapping(value = "/login", method = RequestMethod.GET)
//        public String login() {
//
//            return "login";
//
//        }
//
//        @RequestMapping(value = "/login", method = RequestMethod.POST)
//        public String welcome(@RequestParam String username, @RequestParam String password, ModelMap mapper) {
//            mapper.put("username", username);
//            mapper.put("password", password);
//            if (managementService.authenticate(username, password)) {
//                mapper.put("username", username);
//                return "welcome";
//
//            } else {
//                return "login";
//            }
//
//
//        }
//
//    }




