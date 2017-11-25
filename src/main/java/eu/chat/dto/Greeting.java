package eu.chat.dto;

import java.io.Serializable;

public class Greeting implements Serializable{
	
	private static final long serialVersionUID = -3781691777928422658L;
	
	
	private String content;
	
	public Greeting(){
	}
	
	public Greeting(String content){
		this.content = content;
	}
	
	public String getContent(){
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
