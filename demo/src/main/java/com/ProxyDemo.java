package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProxyDemo {
	
	
	@RequestMapping("/proxyTest")
	public void doProxyTest() {
		System.out.println("Test success");
	}

}
