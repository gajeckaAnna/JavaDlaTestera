package model;

public class Bug implements ConsoleNotification {

    private String bugDescription;
    private int bugPriority;
    private String bugStatus;
    private BugReporter BugReporter;

    public Bug(String bugDescription, int bugPriority, BugReporter BugReporter) {
        this.setBugDescription(bugDescription);
        this.setBugPriority(bugPriority);
        this.BugReporter = BugReporter;
        this.bugStatus = "open";
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10)
            System.out.println("Not enough characters!");
        else
            this.bugDescription = bugDescription;
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if (bugPriority < 1 || bugPriority > 5) {
            System.out.println("Set value between 1 and 5 as bug priority!");
            this.bugPriority = bugPriority > 5 ? 5 : 1;
        } else {
            this.bugPriority = bugPriority;
        }
    }

    public String getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(String bugStatus) {
        switch (bugStatus) {
            case "open":
            case "closed":
            case "rejected":
            case "on hold":
            case "submitted":
            case "ready 4 test":
            case "test in progress":
            case "test completed OK":
            case "test completed NOK":
                this.bugStatus = bugStatus;
                notifyStatusChange();
                break;
            default:
                System.out.println("Allowed bug statuses: open, closed, rejected, on hold, submitted, ready 4 test," +
                        " test in progress, test completed OK, test completed NOK.");
        }

    }

    public void closeBug() {
        this.bugStatus = "closed";
        notifyStatusChange();
    }

    public void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + "; reported by: " + BugReporter.firstName + " "
                + BugReporter.lastName + ", " + BugReporter.email +
                "; bug priority: " + bugPriority + "; Bug status: " + bugStatus + ".");
    }

    public void showBugReportedBy() {
        System.out.println("Reported by: " + BugReporter.firstName + " "
                + BugReporter.lastName + ", " + BugReporter.email +
                ";");
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("The bug status has changed to " + bugStatus.toUpperCase() + ".");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", bugStatus='" + bugStatus + '\'' +
                ", BugReporter=" + BugReporter +
                '}';
    }
}


