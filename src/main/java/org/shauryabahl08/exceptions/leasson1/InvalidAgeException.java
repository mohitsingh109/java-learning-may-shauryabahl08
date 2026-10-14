package org.shauryabahl08.exceptions.leasson1;

// unchecked exception (extends RuntimeException)
// check exception (extends Exception)
public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String msg) {
        super(msg);
    }
}
