package com.example.springredditclone.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerResponse;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.swing.text.AbstractDocument;

@Service
@AllArgsConstructor
public class MailContentBuilder {
    private final TemplateEngine templateEngine;

    String build(String message) {
        Context context = new Context();
        context.setVariable("message",message);
        return templateEngine.process("mailTemplate", context);
    }
}
