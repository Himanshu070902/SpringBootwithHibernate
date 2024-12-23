package in.sp.main.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import in.sp.main.config.HibernateConfig;
import in.sp.main.entity.User;

@Repository
public class DBConnectionImple implements DbConnection {

	@Override
	public User getUserDetails(int id) {
		User user = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession();) {

			user = session.get(User.class, 1);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return user;
	}

}
