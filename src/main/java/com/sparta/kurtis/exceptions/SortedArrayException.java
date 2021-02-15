package com.sparta.kurtis.exceptions;

import com.sparta.kurtis.log.Logging;

public class SortedArrayException extends Exception {
    public SortedArrayException(String errorMessage) {
        super(errorMessage);
        Logging.getLogger().error(errorMessage);
    }
}
