//package eu.chat.controller;
//
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//
//import eu.chat.dto.Greeting;
//import eu.chat.entity.Message;
//
//@Controller
//public class GreetingController {
//
//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
//    public Greeting greeting(Message message) throws Exception {
//        return new Greeting(message.getMessage());
//    }
//}