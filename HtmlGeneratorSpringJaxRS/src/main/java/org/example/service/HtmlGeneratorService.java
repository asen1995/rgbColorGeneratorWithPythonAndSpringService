package org.example.service;

import org.example.model.RgbCodeRequest;

public interface HtmlGeneratorService {
    String generateHtmlRgbDisplayCode(RgbCodeRequest request) throws Exception;
}
