package jp.sample.taskmanagement;

import jp.sample.taskmanagement.model.core.library.maybe.option.IOption;
import jp.sample.taskmanagement.model.port.service.user.UserDto;
import jp.sample.taskmanagement.model.port.service.user.UserServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@EnableAutoConfiguration
@ComponentScan("jp.sample.taskmanagement.model.port")
public class App {
	@Autowired
	UserServicePort userServicePort;

	public static void main(String args[]) {
		SpringApplication.run(App.class, args);
	}

	@RequestMapping("/")
	UserForPublish home() {
		IOption<UserDto> maybeUser = this.userServicePort.findBy("ABCDEFGHIJK");
		return maybeUser.map(dto -> new UserForPublish(dto.id, dto.name))
				.orElseThrow(() -> new IllegalStateException("userが存在しません。"));
	}

	@RequestMapping("/{id}")
	UserForPublish searchById(@PathVariable String id) {
		IOption<UserDto> maybeUser = this.userServicePort.findBy(id);
		return maybeUser.map(dto -> new UserForPublish(dto.id, dto.name))
				.orElseThrow(() -> new IllegalStateException("userが存在しません。"));
	}

	@RequestMapping("/register/{firstName}/{lastName}")
	void register(@PathVariable String firstName, @PathVariable String lastName) {
		this.userServicePort.register(firstName, lastName);
	}

	@RequestMapping("/delete/{id}")
	void delete(@PathVariable String id) {
		this.userServicePort.delete(id);
	}

	@RequestMapping("/users")
	List<UserForPublish> users() {
		return this.userServicePort.findAll().stream().map(userDto -> new UserForPublish(userDto.id, userDto.name))
				.collect(Collectors.toList());
	}
}
