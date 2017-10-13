package com.crmindz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.crmindz.model.Login;
import com.crmindz.model.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void register(User user) {
		String sql = "insert into users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
	}

	public User validateUser(Login login) {
		String sql = "select * from users where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, new ResultSetExtractor<List<User>>(){
			public List<User> extractData(ResultSet rs) throws SQLException {
				List<User> list = new ArrayList<User>();
				while (rs.next()) {
					User user = new User(); 
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setFirstname(rs.getString("firstname"));
					user.setLastname(rs.getString("lastname"));
					user.setEmail(rs.getString("email"));
					user.setAddress(rs.getString("address"));
					user.setPhone(rs.getInt("phone"));
				}
				return list;
			}
		});
		return users.size() > 0 ? users.get(0) : null;
	}

/*class UserMapper implements RowMapper {
	

	
	  public User mapRow(ResultSet rs, int arg1) throws SQLException { User
	  user = new User(); user.setUsername(rs.getString("username"));
	  user.setPassword(rs.getString("password"));
	  user.setFirstname(rs.getString("firstname"));
	  user.setLastname(rs.getString("lastname"));
	  user.setEmail(rs.getString("email"));
	  user.setAddress(rs.getString("address"));
	  user.setPhone(rs.getInt("phone")); return user;
	 
}*/

	public int[] getRowsForPaths(TreePath[] path) {
		// TODO Auto-generated method stub
		return null;
	}
}
