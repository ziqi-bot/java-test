package javaCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailDomainChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a comma-separated list of email domains:");
        String emailDomainsInput = scanner.nextLine();
        List<String> emailDomains = new ArrayList<>();
        for (String emailDomain : emailDomainsInput.split(",")) {
            emailDomains.add(emailDomain.trim());
        }

        System.out.println("Enter a comma-separated list of emails:");
        String emailsInput = scanner.nextLine();
        List<String> emails = new ArrayList<>();
        for (String email : emailsInput.split(",")) {
            emails.add(email.trim());
        }

        for (int i = 0; i < emails.size(); i++) {
            String email = emails.get(i);
            boolean containsEmailDomain = false;
            for (String domain : emailDomains) {
                if (email.endsWith("@" + domain)) {
                    containsEmailDomain = true;
                    break;
                }
            }
            if (containsEmailDomain) {
                emails.set(i, "Y");
            } else {
                emails.set(i, "N");
            }
        }

        System.out.println("Result: " + emails);

        scanner.close();
    }
}
