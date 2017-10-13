package com.crmindz.dao;

import com.crmindz.model.Login;
import com.crmindz.model.User;

public interface UserDao {
	void register(User user);

	User validateUser(Login login);
}
