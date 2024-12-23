package in.sp.main.repository;

import in.sp.main.entity.User;

public interface DbConnection {
	public User getUserDetails(int id);
}
