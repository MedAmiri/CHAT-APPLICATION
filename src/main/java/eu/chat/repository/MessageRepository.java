package eu.chat.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import eu.chat.entity.Message;
import eu.chat.entity.User;

public interface MessageRepository extends MongoRepository<Message, Long> {
	 
	List<Message> findAllByUser(User user);
}

