package com.chenm.gms.gmspro.exception;

public class ProException extends RuntimeException {
    public ProException() {
        super();
    }

    public ProException(String message) {
        super(message);
    }

    public ProException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProException(Throwable cause) {
        super(cause);
    }

    protected ProException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
