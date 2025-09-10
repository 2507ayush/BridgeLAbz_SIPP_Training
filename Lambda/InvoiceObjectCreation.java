package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice for transaction: " + transactionId;
    }
}

public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("T001", "T002", "T003");

        // Generate invoice objects from transaction IDs using constructor reference
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        System.out.println("Generated invoices:");
        invoices.forEach(System.out::println);
    }
}
