package org.example.service;

import org.example.model.HtmlWebSocketMessage;

public interface WebSocketFrontEndClient {

    void callWebSocketInFrontEnd(HtmlWebSocketMessage messageRequest) throws Exception;
}
