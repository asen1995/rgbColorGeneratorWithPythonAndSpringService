package org.example.util;

public class HtmlGenerator {
    public static String generateDisplayColoredBoxWithText(String rgbValue, String text) {

        if(rgbValue == null || text == null){
            // TODO  handle error
            return "ERROR";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("<div style=\"width: 50%; height: 50%; text-align: center; background-color: ");
        builder.append(rgbValue);
        builder.append(" \"> ");
        builder.append(text);
        builder.append("</div>");

        return builder.toString();
    }
}
