package org.example.controller;

import org.example.model.RgbCodeRequest;
import org.example.service.HtmlGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HtmlGeneratorController {

    @Autowired
    HtmlGeneratorService htmlGeneratorService;

    @RequestMapping(value = "generateHtmlRgbDisplayCode", method = RequestMethod.POST)
    public String generateHtmlRgbDisplayCode(@RequestBody RgbCodeRequest request) throws Exception {
        return htmlGeneratorService.generateHtmlRgbDisplayCode(request);
    }
}


