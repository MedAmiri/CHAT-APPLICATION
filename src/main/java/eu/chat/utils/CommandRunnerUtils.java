package eu.chat.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import eu.chat.entity.Message;
import eu.chat.entity.User;
import eu.chat.repository.MessageRepository;
import eu.chat.repository.UserRepository;

public class CommandRunnerUtils {
//		
//	private static final Logger log = LoggerFactory.getLogger(CommandRunnerUtils.class);
//
//	@Bean
//	public CommandLineRunner demo(final MessageRepository reposit) {
//		return new CommandLineRunner() {
//
//			@Override
//			public void run(String... arg0) throws Exception {
//				// save all Massages
//				User user = new User("titi", "tata");
//
//				reposit.save(new Message(user, "Amiri"));
//				// reposit.save(new Message(new User("toti" , "tato"), "Ami"));
//				// reposit.save(new Message(new User("ttt" , "tgtta"), "Ari"));
//				// reposit.save(new Message(new User("ti" , "taa"), "Amfi"));
//
//				// fetch ................
//
//				log.info("Messages found with findAll():");
//				log.info("-------------------------------");
//				for (Message message : reposit.findAll()) {
//					log.info(message.toString());
//				}
//				log.info("");
//
//				// fetch ..................................
//
//				Message message = reposit.findOne(1L);
//				log.info("Message found with findOne(1L):");
//				log.info("--------------------------------");
//				log.info(message.toString());
//				log.info("");
//
//				// fetch ................................
//
//				log.info("Users found with findByLastName('Bauer'):");
//				log.info("--------------------------------------------");
//				for (Message message1 : reposit.findAllByUser(user)) {
//					log.info(message1.toString());
//				}
//				log.info("");
//			}
//		};
//	}
//
//	@Bean
//	public CommandLineRunner demo2(final UserRepository repository) {
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//
//				// save a couple of customers
//				repository.save(new User("Jack", "Bauer"));
//				repository.save(new User("Chloe", "O'Brian"));
//				repository.save(new User("Kim", "Bauer"));
//				repository.save(new User("David", "Palmer"));
//				repository.save(new User("Michelle", "Dessler"));
//
//				// save the messages
//
//				// fetch all customers
//				log.info("Users found with findAll():");
//				log.info("-------------------------------");
//				for (User user : repository.findAll()) {
//					log.info(user.toString());
//				}
//				log.info("");
//
//				// fetch an individual customer by ID
//				User user = repository.findOne(1L);
//				log.info("Users found with findOne(1L):");
//				log.info("--------------------------------");
//				log.info(user.toString());
//				log.info("");
//
//				// fetch customers by last name
//				log.info("Users found with findByLastName('Bauer'):");
//				log.info("--------------------------------------------");
//				for (User bauer : repository.findByLastName("Bauer")) {
//					log.info(bauer.toString());
//				}
//				log.info("");
//			}
//		};
//	}
}
