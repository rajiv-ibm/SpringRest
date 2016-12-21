package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mongo.User;
import mongo.UserRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private UserRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		repo.deleteAll();
		
		//save some users
		repo.save(new User("Smith", 30, "smith@comp.com"));
		repo.save(new User("Robert", 18, "robert@comp.com"));
		
		System.out.println("User found with findAll: ");
		System.out.println("-----------------------");
		
		for(User user: repo.findAll()){
			System.out.println(user);
		}
	}

}
