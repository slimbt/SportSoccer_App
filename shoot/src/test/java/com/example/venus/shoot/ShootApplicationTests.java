package com.example.venus.shoot;
import com.example.venus.shoot.models.MatchModel;
import com.example.venus.shoot.repositories.MatchRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShootApplicationTests {

	@Autowired
	private MatchRepository produitRepository;
	@Test
	public void testCreateProduit() {
		MatchModel prod = new MatchModel("est","ca",1,2);
		produitRepository.save(prod);
	}

}
