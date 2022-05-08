package org.example.service;

import org.example.model.RgbCodeRequest;
import org.example.util.HtmlGenerator;
import org.springframework.stereotype.Service;

@Service
public class HtmlGeneratorServiceImpl implements HtmlGeneratorService {
    @Override
    public String generateHtmlRgbDisplayCode(RgbCodeRequest request) {

        String htmlCode = HtmlGenerator.generateDisplayColoredBoxWithText(request.getRgbValue(),request.getText());

        //TODO send htmlcode via WebSocket

        return "SUCCESS";
    }
}
