package eu.chat.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "message")
public class Message implements Serializable{
	
	private static final long serialVersionUID = -6871939981081748916L;

	@Id
    private long id;
    
	private String message;
	
	private User user;
	
	public Message() {
	}
	
	public Message(User user, String message){
		this.user = user;
		this.message = message ;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
