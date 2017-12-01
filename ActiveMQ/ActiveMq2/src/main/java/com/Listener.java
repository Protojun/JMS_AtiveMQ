package com;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Listener {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	private String TAG = this.getClass().getName();
	
	public void receiveMessage(String str){
		logger.debug("> listen", TAG);
		logger.debug("> listen message[{}]", str);
	}
}