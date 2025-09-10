package Lambda;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient needs attention"),
            new Alert("Info", "Routine check"),
            new Alert("Warning", "Medication reminder")
        );

        // Filter alerts based on user preference using Predicate with lambda
        Predicate<Alert> showCritical = alert -> alert.type.equals("Critical");
        Predicate<Alert> showWarning = alert -> alert.type.equals("Warning");

        System.out.println("Critical alerts:");
        alerts.stream().filter(showCritical).forEach(System.out::println);

        System.out.println("\nWarning alerts:");
        alerts.stream().filter(showWarning).forEach(System.out::println);
    }
}
