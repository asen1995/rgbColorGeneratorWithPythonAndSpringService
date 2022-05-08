package org.example.service;

import org.example.model.HtmlWebSocketMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class WebSocketFrontEndClientImpl implements WebSocketFrontEndClient {

    @Autowired
    SimpMessagingTemplate webSocketFrontEndSimpMessagingTemplate;

    @Override
    public void callWebSocketInFrontEnd(HtmlWebSocketMessage messageRequest) throws Exception {
        this.webSocketFrontEndSimpMessagingTemplate.convertAndSend("/topic/displayColoredBox", messageRequest);
    }
}
