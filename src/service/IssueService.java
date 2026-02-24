package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Tuition payment issue", 3));
        issues.add(new Issue("Failed exam appeal", 1));
        issues.add(new Issue("Library fine", 4));
        issues.add(new Issue("Course registration problem", 2));
        issues.add(new Issue("Missing transcript", 2));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if (issues.isEmpty()) {
            System.out.println("No issues available.");
            return;
        }
        
        Issue mostUrgent = issues.peek();
        System.out.println("Most urgent issue: " + mostUrgent);
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        if (!issues.isEmpty()) {
            Issue resolved1 = issues.poll();
            System.out.println("Resolved issue: " + resolved1);
        }
        
        if (!issues.isEmpty()) {
            Issue resolved2 = issues.poll();
            System.out.println("Resolved issue: " + resolved2);
        }
        
        if (issues.size() < 2) {
            System.out.println("Not enough issues to resolve 2 issues.");
        }
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        if (issues.isEmpty()) {
            System.out.println("No issues available.");
            return;
        }
        
        System.out.println("Remaining Issues:");
        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        Issue newIssue = new Issue(description, urgency);
        issues.add(newIssue);
        System.out.println("New issue added: " + newIssue);
    }
}
