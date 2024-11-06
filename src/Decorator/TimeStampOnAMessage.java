package Decorator;

public class TimeStampOnAMessage implements Message {
    private Message message;

    public TimeStampOnAMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        String originalContent = message.getContent();
        // Дата й час фіксовані, щоб не виводити реальний
        String timestamp = "2024-11-06 00:00:07";
        return "(Timestamp: " + timestamp + ") " + originalContent;
    }
}