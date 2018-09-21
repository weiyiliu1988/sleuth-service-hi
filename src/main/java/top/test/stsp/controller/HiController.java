package top.test.stsp.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiController {

	private Logger logger = Logger.getLogger(HiController.class);

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hi")
	public String callHome() {
		logger.info("calling trace service-hi  ");
		return restTemplate.getForObject("http://localhost:8003/miya", String.class);
	}

	@RequestMapping("/info")
	public String info() {
		logger.info("calling trace service-hi ");

		return "i'm service-hi";

	}

}
