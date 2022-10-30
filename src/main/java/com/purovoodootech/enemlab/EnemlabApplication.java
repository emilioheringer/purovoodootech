package com.purovoodootech.enemlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class EnemlabApplication {

	@RequestMapping("/copyrightpt_BR")
	public String copyrightptbr(){
		return "copyrights-pt_br.html";
	}

	@RequestMapping("/app-ads.txt")
	public String appads(){
			return "app-ads.txt";
	}
	public static void main(String[] args) {
		SpringApplication.run(EnemlabApplication.class, args);
	}

}
