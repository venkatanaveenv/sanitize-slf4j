package com.nerver.sanitizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.nerver.sanitizer.utils.MaskingPatternLayout;

@Component
public class Launcher {

    private final static Logger log = LoggerFactory.getLogger(Launcher.class);

    @Autowired
    private MaskingPatternLayout maskingPatternLayout;

    public static void main(String[] args) {
        new GenericXmlApplicationContext(
            "classpath*:/**/*.xml"
        )
        .getBean(
            Launcher.class
        )
        .run(args);
    }

    public void run(String[] args) {
        log.debug(
        		maskingPatternLayout.getPattern()
        );
    }
    
}
