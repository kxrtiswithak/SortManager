package com.sparta.kurtis.exceptions;

import com.sparta.kurtis.log.Logging;

public class EmptyArrayException extends Exception {
    public EmptyArrayException(String errorMessage) {
        super(errorMessage);
        Logging.getLogger().error(errorMessage);

    }
}
