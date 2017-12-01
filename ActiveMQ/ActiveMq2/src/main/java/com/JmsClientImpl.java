package com;
import org.springframework.stereotype.Service;

@Service
public class JmsClientImpl implements JmsClient{
	
	private Sender sender;
 
	@Override
	public void send(String msg) {
		sender.send(msg);
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}
 
}