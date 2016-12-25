package user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import user.model.User;
import user.repo.UserRepository;

@RestController
@RequestMapping("/usermgmt")
public class UserMgmtController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public User create(@RequestBody User user){
		
		User result = userRepository.save(user);
		return result;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public User get(@PathVariable String id){
		return userRepository.findOne(id);
	}

	@RequestMapping(method = RequestMethod.GET, value="/all")
	public List<User> getAll(){
		return userRepository.findAll();
	}
}
