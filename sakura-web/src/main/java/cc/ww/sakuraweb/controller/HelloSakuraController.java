package cc.ww.sakuraweb.controller;

import cc.ww.sakuraservice.service.HelloSakuraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sakura")
public class HelloSakuraController {
    @Autowired
    private HelloSakuraService helloSakuraService;
    @RequestMapping("/hello")
    @ResponseBody
    public String helloSakura(){
        return helloSakuraService.helloSakura();
    }
}
