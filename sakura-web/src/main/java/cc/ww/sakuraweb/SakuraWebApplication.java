package cc.ww.sakuraweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cc.ww.sakuraservice.service.impl","cc.ww.sakuraweb.controller"})
public class SakuraWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SakuraWebApplication.class, args);
	}

}
