package Decorator;

public class AuthorStampOnAMessage implements Message {
    private Message message;
    private String authorName;

    public AuthorStampOnAMessage(Message message) {
        this.message = message;
        this.authorName = "Volodymyr Koliesnik";
    }

    @Override
    public String getContent() {
        String originalContent = message.getContent();
        return "(Author: " + authorName + ") " + originalContent  ;
    }
}