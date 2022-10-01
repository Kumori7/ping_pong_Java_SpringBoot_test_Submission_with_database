package com.ab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ab.Entities.Pong;
import com.ab.Services.PongServiceImpl;

@RestController
public class PongRestController {

	@Autowired
	private PongServiceImpl serviceImpl;

	@RequestMapping("/save")
	public void savePongValue(@RequestBody Pong pong) {

		serviceImpl.savePongValue(pong);
	}

	@GetMapping("/ping/rest")
	public String getPing() {

		String pong = serviceImpl.displayPongValue();

		return pong;
	}

} // end of class
