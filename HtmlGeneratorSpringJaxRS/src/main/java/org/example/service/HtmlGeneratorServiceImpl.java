package org.example.service;

import org.example.model.HtmlWebSocketMessage;
import org.example.model.RgbCodeRequest;
import org.example.util.HtmlGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class HtmlGeneratorServiceImpl implements HtmlGeneratorService {

    @Autowired
    WebSocketFrontEndClient webSocketFrontEndClient;
    @Override
    public String generateHtmlRgbDisplayCode(RgbCodeRequest request) throws Exception {

        String htmlCode = HtmlGenerator.generateDisplayColoredBoxWithText(request.getRgbValue(),request.getText());
        HtmlWebSocketMessage messageRequest = new HtmlWebSocketMessage(htmlCode);

        webSocketFrontEndClient.callWebSocketInFrontEnd(messageRequest);

        return "SUCCESS";
    }


}
