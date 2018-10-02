package jp.sample.taskmanagement;

import jp.sample.taskmanagement.model.adapter.mysql.user.EnumUserMapper;
import jp.sample.taskmanagement.model.adapter.mysql.user.IUserRecordMapper;
import jp.sample.taskmanagement.model.adapter.mysql.user.UserRecord;
import jp.sample.taskmanagement.model.core.domain.models.user.User;
import jp.sample.taskmanagement.model.core.library.maybe.option.IOption;
import jp.sample.taskmanagement.model.port.service.user.UserDto;
import jp.sample.taskmanagement.model.port.service.user.UserServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("jp.sample.taskmanagement.model.port")
public class App {
	@Autowired
	UserServicePort userServicePort;
	@Autowired
	IUserRecordMapper userRecordMapper;

	public static void main(String args[]) {
		SpringApplication.run(App.class, args);
	}

	@RequestMapping("/")
	String home() {
		IOption<UserDto> maybeUser = this.userServicePort.findBy("1");
		UserRecord userRecord = this.userRecordMapper.selectWhereId("ABCDEFGHIJK");

		User user = EnumUserMapper.apply(userRecord);

		return maybeUser.map(UserDto :: toString)
						.orElse("ユーザーが存在しません。")
			   + ",user=[" + user + "]";
	}
}
