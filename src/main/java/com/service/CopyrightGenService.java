package com.service;

import com.config.StarterCopyrightProperties;

import java.time.LocalDate;

public class CopyrightGenService {

    private final StarterCopyrightProperties props;

    public CopyrightGenService(StarterCopyrightProperties props) {
        this.props = props;
    }

    public String generateCopyright() {
        return String.format("(c) %s %s", LocalDate.now(), props.getAuthor());
    }
}
