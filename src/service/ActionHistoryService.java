package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.add("Submitted Assignment");
        actions.add("Dropped Course");
        actions.add("Registered Course");
        actions.add("Updated Profile");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if (!actions.isEmpty()) {
            String undone = actions.removeLast();
            System.out.println("Undone action: " + undone);
        } else {
            System.out.println("No actions to undo.");
        }
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.add("Requested Transcript");
        System.out.println("Action added: Requested Transcript");
    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        if (actions.isEmpty()) {
            System.out.println("No actions available.");
            return;
        }
        
        System.out.println("First action: " + actions.getFirst());
        System.out.println("Last action: " + actions.getLast());
    }

    public void printHistory() {
        // TODO: Iterate through history
        if (actions.isEmpty()) {
            System.out.println("No action history available.");
            return;
        }
        
        System.out.println("Action History:");
        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }
}
