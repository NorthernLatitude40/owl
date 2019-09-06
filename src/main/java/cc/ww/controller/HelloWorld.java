package cc.ww.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/owl")
public class HelloWorld {
    @RequestMapping("/hello")
    @ResponseBody
    public void helloWorld() {

    }
}
