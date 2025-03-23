import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    }

    public static int nunUniqueEmails(String[] emails){


        Set<String> normalized = new HashSet<>();

        for (String email : emails) {
            String[] separator= email.split("@");
            String[] localName = separator[0].split("\\+");
            normalized.add(localName[0].replace(".","") + "@" + separator[1] );
        }
        return normalized.size();
    }
}
