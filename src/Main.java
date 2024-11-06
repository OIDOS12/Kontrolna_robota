import Decorator.Message;
import Decorator.BaseMessage;
import Decorator.EncryptedMessage;
import Decorator.CompressedMessage;
import Decorator.TimeStampOnAMessage;
import Decorator.AuthorStampOnAMessage;



public class Main {
    public static void main(String[] args) {

        Message message = new BaseMessage("Hello World!");
        System.out.println("Базове повідомлення: \n" + message.getContent());

        message = new EncryptedMessage(message);
        System.out.println("Шифрування: \n" + message.getContent());

        message = new CompressedMessage(message);
        System.out.println("Стиснення: \n" + message.getContent());

        message = new TimeStampOnAMessage(message);
        System.out.println("Додавання дати та часу: \n" + message.getContent());

        message = new AuthorStampOnAMessage(message);
        System.out.println("Додавання авторства: \n" + message.getContent());
    }
}
