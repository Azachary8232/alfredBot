import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {

        return " Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {

        return String.format("Hello, %s. Lovely to see you", name);
    }

    public String dateannouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexis(String conversation) {

        return "for snarky response return string";
    }
}