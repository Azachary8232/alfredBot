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
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");

        if (alexis > 0){
            return "Right away ,sir. She certainly isn't sophisticated enough for that.";
        }
        else if (alfred > 0){
            return "As you wish, naturally.";
        }
        else{
            return "Right. And with that I shall retire.";
        }
    }
}