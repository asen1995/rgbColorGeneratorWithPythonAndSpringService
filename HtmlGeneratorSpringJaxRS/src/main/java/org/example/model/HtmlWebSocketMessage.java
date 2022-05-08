package org.example.model;

public class HtmlWebSocketMessage {
    private String htmlCode;

    public HtmlWebSocketMessage(String htmlCode) {
        this.htmlCode = htmlCode;
    }

    public String getHtmlCode() {
        return htmlCode;
    }

    public void setHtmlCode(String htmlCode) {
        this.htmlCode = htmlCode;
    }
}
