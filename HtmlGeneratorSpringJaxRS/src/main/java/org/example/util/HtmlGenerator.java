package org.example.util;

public class HtmlGenerator {
    public static String generateDisplayColoredBoxWithText(String rgbValue, String text) {

        if(rgbValue == null || text == null){
            // TODO  handle error
            return "ERROR";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("<div style=\"width: 50%; height: 50%; padding: 100px 0 100px; text-align: center; background-color: ");
        builder.append(rgbValue);
        builder.append(" \"> ");
        builder.append(text);
        builder.append("</div>");

        return builder.toString();
    }
}
