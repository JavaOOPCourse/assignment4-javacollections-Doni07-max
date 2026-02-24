package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        // TODO: Add 1 urgent appointment at the beginning
        appointments.add("Appointment 1: Math Tutoring");
        appointments.add("Appointment 2: Career Counseling");
        appointments.add("Appointment 3: Lab Meeting");
        appointments.addFirst("URGENT: Academic Review");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (!appointments.isEmpty()) {
            String removed = appointments.removeLast();
            System.out.println("Cancelled appointment: " + removed);
        } else {
            System.out.println("No appointments to cancel.");
        }
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }
        
        System.out.println("First appointment: " + appointments.getFirst());
        System.out.println("Last appointment: " + appointments.getLast());
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }
        
        System.out.println("All Appointments:");
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }
}
