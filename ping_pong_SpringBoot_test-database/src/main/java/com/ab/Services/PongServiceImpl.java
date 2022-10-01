package com.ab.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ab.Entities.Pong;
import com.ab.Repositories.PongValueRepository;

@Service
public class PongServiceImpl implements PongService {

	@Autowired
	private PongValueRepository repository;

	private List<Pong> list = new ArrayList<>();

	@Override
	public Pong savePongValue(@RequestBody Pong pong) {

		return repository.save(pong);

	}

	@Override
	public String displayPongValue() {

		list = repository.findAll();

		Pong pongValue = new Pong();

		if (list.size() == 0) {
			String empty = "please create a pong value";

			return empty;

		} else {
			pongValue = list.get(0);
		}

		String firstname = pongValue.getFirstname();

		String lastname = pongValue.getLastname();

		String pong = "ping-pong-" + firstname + "-" + lastname;

		return pong;
	}

	@Override
	public void deletePongValue() {

		repository.deleteAll();
		list.clear();

	}

} // end of class
