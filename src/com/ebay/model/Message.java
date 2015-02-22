package com.ebay.model;

/**
 * This class creates message between buyer and seller
 * @author BITBay
 *
 */
public class Message {
	
	public String content;
	public int message_id;
	public int sender_id;
	public int reciever_id;
	
	/**
	 * creates a message
	 * @param content String content of the message
	 * @param message_id int id of the message
	 * @param sender_id int id of the sender/buyer
	 * @param reciever_id id of the reciever/seller
	 */
	public Message(String content, int message_id, int sender_id,
			int reciver_id) {}
	
	/**
	 * saves the message in the database
	 * @return true or false
	 */
	public boolean save(){
		return false;
		}
	
	/**
	 * updates the message in the database
	 */
	public void update() {};
	
	/**
	 * deletes the message from the database
	 */
	public static void delete() {}


	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}


	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}


	/**
	 * @return the message_id
	 */
	public int getMessage_id() {
		return message_id;
	}


	/**
	 * @return the sender_id
	 */
	public int getSender_id() {
		return sender_id;
	}


	/**
	 * @return the reciever_id
	 */
	public int getReciever_id() {
		return reciever_id;
	};

	
			
	 
}
