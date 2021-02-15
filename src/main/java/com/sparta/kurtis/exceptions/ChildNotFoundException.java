package com.sparta.kurtis.exceptions;

import com.sparta.kurtis.log.Logging;

public class ChildNotFoundException extends Exception {
    public ChildNotFoundException(String errorMessage) {
        super(errorMessage);
        Logging.getLogger().error(errorMessage);
    }
}
