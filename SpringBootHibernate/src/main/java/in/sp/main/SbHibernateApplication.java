package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.entity.User;
import in.sp.main.repository.DbConnection;

@SpringBootApplication
public class SbHibernateApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SbHibernateApplication.class, args);
		DbConnection db = context.getBean(DbConnection.class);
		User user = db.getUserDetails(1);
		if (user != null) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
		} else {
			System.out.println("User not found in database,");
		}
	}

}
