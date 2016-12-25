package user.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import user.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
}
