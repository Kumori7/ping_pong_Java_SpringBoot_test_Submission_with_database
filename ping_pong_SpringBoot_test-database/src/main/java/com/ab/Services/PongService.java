package com.ab.Services;

import org.springframework.web.bind.annotation.RequestBody;

import com.ab.Entities.Pong;

public interface PongService {

	public Pong savePongValue(@RequestBody Pong pong);

	public String displayPongValue();
	
	public void deletePongValue();

} // end of interface
