package com;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;


public class Sender {

	private JmsMessagingTemplate jmsMessagingTemplate;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	private String TAG = this.getClass().getName();
	
	public void send(String msg) {
        logger.debug("> send", TAG);
        MessageBuilder<String> builder = MessageBuilder.withPayload(msg);
		Message<String> message = builder.build();
		jmsMessagingTemplate.send(message);
    }
	
	public void setJmsMessagingTemplate(JmsMessagingTemplate jmsMessagingTemplate) {
		this.jmsMessagingTemplate = jmsMessagingTemplate;
	}
	
}
