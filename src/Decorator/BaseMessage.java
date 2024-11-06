package Decorator;

public class BaseMessage implements Message{
    private String message;

    public BaseMessage(String text) {
        this.message = text;
    }

    @Override
    public String getContent() {
        return message;
    }
}

