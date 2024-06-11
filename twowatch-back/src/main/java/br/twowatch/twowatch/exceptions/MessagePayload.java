package br.twowatch.twowatch.exceptions;

public class MessagePayload {
    private String message;

    public MessagePayload(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
