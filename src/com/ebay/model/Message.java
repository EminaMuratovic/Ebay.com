package com.ebay.model;

public class Message {
	
	public String content;
	public int message_id;
	public int sender_id;
	public int reciever_id;
	
	public Message(String content, int message_id, int sender_id,
			int reciover_id) {}
	
	
	public boolean save(){
		return false;
		}
	
	public void update() {};
	
	public static void delete() {};


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}

	public int getSender_id() {
		return sender_id;
	}

	public void setSender_id(int sender_id) {
		this.sender_id = sender_id;
	}

	public int getReciover_id() {
		return reciever_id;
	}

	public void setReciover_id(int reciover_id) {
		this.reciever_id = reciover_id;
	};
			
			
	 
}
