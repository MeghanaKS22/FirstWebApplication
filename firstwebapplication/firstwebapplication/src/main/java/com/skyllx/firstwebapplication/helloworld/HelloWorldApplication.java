package com.skyllx.firstwebapplication.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldApplication {

    @RequestMapping("/hey-hi")
    @ResponseBody
    public String printHelloWorld()
    {
        return "Hey !!!  hello my world!!";
    }

    @RequestMapping("/hey-html")
    @ResponseBody
    public StringBuffer printHtml()
    {
        var sb = new StringBuffer();
        sb.append("<!DOCTYPE html>");
        sb.append("<html>");
        sb.append("<head><title>My Page</title></head>");
        sb.append("<body><h1>Hello!</h1><p>This is a short HTML page.</p></body>");
        sb.append("</html>");
        return sb;
    }
    @RequestMapping("hey-jsp")
    public String printJSP()
    {
        return "sayHello";
    }
}
