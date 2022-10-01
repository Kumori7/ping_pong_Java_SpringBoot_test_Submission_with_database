package com.ab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.Entities.Pong;
import com.ab.Services.PongServiceImpl;

@Controller
public class PongController {

	@Autowired
	private PongServiceImpl serviceImpl;

	@RequestMapping("/")
	public String startPage() {

		return "start_page";
	}

	@RequestMapping("/new-form-page")
	public String newPongPage(Model model) {

		Pong pong = new Pong();

		model.addAttribute("pongString", pong);

		return "new_pong_form";
	}

	@RequestMapping("/create")
	public String createPongString(Pong pong) {

		serviceImpl.savePongValue(pong);

		return "redirect:/";
	}

	@RequestMapping("/ping")
	public String displayPongString(Model model) {

		String pong = serviceImpl.displayPongValue();

		model.addAttribute("pong", pong);

		return "display_pong";
	}

	@RequestMapping("/delete/pong")
	public String deletePongValue() {

		serviceImpl.deletePongValue();

		return "redirect:/ping";

	}

} // end of class
