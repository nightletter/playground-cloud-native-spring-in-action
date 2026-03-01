package me.nightletter.playgroundcloudnativespringinaction.domain;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
