import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        // Initialize all services with sample data
        studentService.initializeStudents();
        appointmentService.initializeAppointments();
        issueService.initializeIssues();
        actionService.initializeActions();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== 🎓 Smart University Service System =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Appointments");
            System.out.println("3. Show Emergency Issues");
            System.out.println("4. Show Action History");
            System.out.println("5. Add New Issue");
            System.out.println("6. Undo Action");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Show Students
                    System.out.println("\n--- Student Management ---");
                    studentService.printStudents();
                    studentService.removeLowGPA();
                    studentService.findHighestGPA();
                    studentService.insertAtIndex();
                    System.out.println("\nStudents after insertion:");
                    studentService.printStudents();
                    break;
                case 2:
                    // Show Appointments
                    System.out.println("\n--- Appointment Management ---");
                    appointmentService.printAppointments();
                    appointmentService.showFirstAndLast();
                    appointmentService.cancelLast();
                    System.out.println("\nAppointments after cancellation:");
                    appointmentService.printAppointments();
                    break;
                case 3:
                    // Show Emergency Issues
                    System.out.println("\n--- Emergency Issues Management ---");
                    issueService.showMostUrgent();
                    issueService.printRemainingIssues();
                    issueService.resolveIssues();
                    System.out.println("\nRemaining issues after resolution:");
                    issueService.printRemainingIssues();
                    break;
                case 4:
                    // Show Action History
                    System.out.println("\n--- Action History ---");
                    actionService.printHistory();
                    actionService.showFirstAndLast();
                    break;
                case 5:
                    // Add New Issue
                    System.out.println("\n--- Add New Issue ---");
                    System.out.print("Enter issue description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter urgency level (1 = most urgent): ");
                    int urgency = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    issueService.addNewIssue(description, urgency);
                    break;
                case 6:
                    // Undo Action
                    System.out.println("\n--- Undo Action ---");
                    actionService.undoLastAction();
                    actionService.addRequestedTranscript();
                    System.out.println("\nUpdated action history:");
                    actionService.printHistory();
                    break;
                case 7:
                    System.out.println("Exiting... 👋");
                    break;
                default:
                    System.out.println("Invalid option ❌");
            }

        } while (choice != 7);

        scanner.close();
    }
}
