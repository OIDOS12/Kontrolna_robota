package Decorator;

public class CompressedMessage implements Message {
    private Message message;

    public CompressedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        //Щоб не придумувати метод стиснення просто виведу, оригінал, але з плашкою Compressed
        String compressedContent = message.getContent();
        return "(Compressed) " + compressedContent;
    }
}
