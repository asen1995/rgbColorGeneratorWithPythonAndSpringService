package org.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HtmlGeneratorTest {

    @Test
    void generateDisplayColoredBoxWithText() {
        String expectedHtmlCode = "<div style=\"width: 50%; height: 50%; text-align: center; background-color: rgb(255, 165, 0) \"> someText</div>";

        String rgbValue = "rgb(255, 165, 0)";
        String text = "someText";

        String generatedHtmlCode = HtmlGenerator.generateDisplayColoredBoxWithText(rgbValue, text);

        assertEquals(expectedHtmlCode,generatedHtmlCode);
    }
}
