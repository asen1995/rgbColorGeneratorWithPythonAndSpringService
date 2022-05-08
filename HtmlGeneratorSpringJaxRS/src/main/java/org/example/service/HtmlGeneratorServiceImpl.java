package org.example.service;

import org.example.model.HtmlWebSocketMessage;
import org.example.model.RgbCodeRequest;
import org.example.util.HtmlGenerator;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class HtmlGeneratorServiceImpl implements HtmlGeneratorService {
    @Override
    public String generateHtmlRgbDisplayCode(RgbCodeRequest request) throws Exception {

        String htmlCode = HtmlGenerator.generateDisplayColoredBoxWithText(request.getRgbValue(),request.getText());

        HtmlWebSocketMessage messageRequest = new HtmlWebSocketMessage(htmlCode);

        //TODO send htmlcode via WebSocket

        greeting(messageRequest);
        return "SUCCESS";
    }

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public HtmlWebSocketMessage greeting(HtmlWebSocketMessage messageRequest) throws Exception {
        Thread.sleep(1000); // simulated delay
        return messageRequest;
    }
}
