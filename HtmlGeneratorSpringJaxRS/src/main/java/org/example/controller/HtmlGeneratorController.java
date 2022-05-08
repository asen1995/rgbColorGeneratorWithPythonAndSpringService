package org.example.controller;

import org.example.model.RgbCodeRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HtmlGeneratorController {

    @RequestMapping(value = "generateHtmlRgbDisplayCode", method=RequestMethod.POST)
    public String generateHtmlRgbDisplayCode(@RequestBody RgbCodeRequest request) {
        return "Success";
    }
}


