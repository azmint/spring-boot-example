package jp.example;

import jp.example.model.interfaces.stock.*;
import jp.example.model.interfaces.stock.dto.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@EnableAutoConfiguration
@ComponentScan("jp.example.model")
public class App {
	@Autowired
	StockServiceFacade stockServiceFacade;

	@RequestMapping("/")
	String home() {
		Optional<StockDto> maybeStock = stockServiceFacade.execute(1);
		return maybeStock.map(StockDto::toString).orElse("");
	}

	public static void main(String args[]) {
		SpringApplication.run(App.class, args);
	}
}
