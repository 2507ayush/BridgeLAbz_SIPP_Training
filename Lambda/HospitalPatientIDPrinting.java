package Lambda;

import java.util.Arrays;
import java.util.List;

public class HospitalPatientIDPrinting {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P123", "P456", "P789");

        // Use method reference to print all patient IDs
        System.out.println("Patient IDs:");
        patientIDs.forEach(System.out::println);
    }
}
