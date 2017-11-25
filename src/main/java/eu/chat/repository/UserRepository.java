package eu.chat.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import eu.chat.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {

	User findByFirstName(String firstName);

	List<User> findByLastName(String lastName);
}
