package com.anurag.design.patterns.decorator;

public class MessageDecorator implements Message{
	
	private Message message;
	
	public MessageDecorator(Message message){
		this.message=message;
	}

	@Override
	public String getContent() {
		String originalMsg = message.getContent();
		return originalMsg.toUpperCase();
	}
	

}
