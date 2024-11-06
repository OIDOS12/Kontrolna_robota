package Decorator;

import java.util.Base64;

public class EncryptedMessage implements Message {
    private Message message;

    public EncryptedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        String originalContent = message.getContent();
        //Тут відбувається кодування через бібліотеку Base64
        String encodedContent = Base64.getEncoder().encodeToString(originalContent.getBytes());
        return "(Encrypted) " + encodedContent;
    }
}
