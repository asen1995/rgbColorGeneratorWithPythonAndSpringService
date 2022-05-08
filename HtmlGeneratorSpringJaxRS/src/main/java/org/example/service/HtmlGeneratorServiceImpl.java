package org.example.service;

import org.example.model.HtmlWebSocketMessage;
import org.example.model.RgbCodeRequest;
import org.example.util.HtmlGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class HtmlGeneratorServiceImpl implements HtmlGeneratorService {

    private static final Logger logger = LogManager.getLogger(HtmlGeneratorServiceImpl.class);

    @Autowired
    WebSocketFrontEndClient webSocketFrontEndClient;
    @Override
    public String generateHtmlRgbDisplayCode(RgbCodeRequest request) throws Exception {

        logger.info("generateHtmlRgbDisplayCode gets called with rbg {} and text {}" , request.getRgbValue(),request.getText());

        String htmlCode = HtmlGenerator.generateDisplayColoredBoxWithText(request.getRgbValue(),request.getText());
        HtmlWebSocketMessage messageRequest = new HtmlWebSocketMessage(htmlCode);

        webSocketFrontEndClient.callWebSocketInFrontEnd(messageRequest);

        logger.info("generateHtmlRgbDisplayCode finished succesfully");

        return "SUCCESS";
    }


}
