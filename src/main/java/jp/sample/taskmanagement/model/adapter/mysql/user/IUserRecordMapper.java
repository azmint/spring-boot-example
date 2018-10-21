package jp.sample.taskmanagement.model.adapter.mysql.user;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IUserRecordMapper {
	@Insert("INSERT INTO user (id, firstName, lastName, authority) VALUES (#{id}, #{firstName}, #{lastName}, #{authority})")
	void insert(UserRecord userRecord);

	@Select("SELECT id, firstName, lastName, authority FROM user WHERE id = #{id}")
	UserRecord selectWhereId(String id);

	@Select("SELECT id, firstName, lastName, authority FROM user")
	List<UserRecord> selectAll();

	@Delete("DELETE FROM user WHERE ID = #{id}")
	void delete(String id);
}
