package org.itstep.task04;

public class NotSortedExceprion extends Exception {
    public NotSortedExceprion() {
    }

    public NotSortedExceprion(String message) {
        super( message );
    }

    public NotSortedExceprion(String message, Throwable cause) {
        super( message, cause );
    }

    public NotSortedExceprion(Throwable cause) {
        super( cause );
    }

    public NotSortedExceprion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
