package com.dh.gameslibraryservice.repository.feign;

import com.dh.gameslibraryservice.model.dto.GameWS;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "games-service")
public interface GameFeignRepository {
	@GetMapping("/games/{gameId}")
	GameWS getGameDetails(@PathVariable Integer gameId);
}
