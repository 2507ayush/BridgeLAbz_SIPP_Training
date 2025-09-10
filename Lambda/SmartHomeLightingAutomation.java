package Lambda;

import java.util.function.Consumer;

public class SmartHomeLightingAutomation {
    // Functional interface for light actions
    interface LightAction {
        void execute();
    }

    public static void main(String[] args) {
        // Define lambda behaviors for different triggers
        LightAction motionTrigger = () -> System.out.println("Motion detected: Turning on lights with soft glow.");
        LightAction timeOfDayTrigger = () -> System.out.println("Time of day: Adjusting lights to bright mode.");
        LightAction voiceCommandTrigger = () -> System.out.println("Voice command: Flashing lights for confirmation.");

        // Simulate triggers
        System.out.println("Simulating triggers:");
        motionTrigger.execute();
        timeOfDayTrigger.execute();
        voiceCommandTrigger.execute();
    }
}
