package eu.chat.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User implements Serializable{

	private static final long serialVersionUID = 2123051877312441803L;

	@Id
    private long id;
    
    private String firstName;
    private String lastName;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

    public String getFirstName(){
    	return firstName;
    }
    
    public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
    
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}