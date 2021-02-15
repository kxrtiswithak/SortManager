package com.sparta.kurtis.exceptions;

import com.sparta.kurtis.log.Logging;

public class UnsortedArrayException extends Exception {
    public UnsortedArrayException(String errorMessage) {
        super(errorMessage);
        Logging.getLogger().error(errorMessage);

    }
}
