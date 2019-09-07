package cc.ww.sakuraservice.service.impl;

import cc.ww.sakuraservice.service.HelloSakuraService;
import org.springframework.stereotype.Service;

@Service
public class HelloSakuraServiceimpl implements HelloSakuraService {
    @Override
    public String helloSakura() {
        return "卡哇伊,sakura!";
    }
}
