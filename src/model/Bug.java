package model;

public class Bug {

    private String bugDescription;
    private int bugPriority;
    private String bugStatus;
    private BugReporter BugReporter;

    public Bug(String bugDescription, int bugPriority, BugReporter BugReporter) {
        this.bugDescription = bugDescription;

        if (bugPriority < 1) {
            this.bugPriority = 1;
        } else if (bugPriority > 5) {
            this.bugPriority = 5;
        } else {
            this.bugPriority = bugPriority;
        }
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

    public String getBugReportedBy() {
        return bugReportedBy;
    }


    public void setBugPriority(int bugPriority) {
        if (bugPriority < 1 || bugPriority > 5) {
            System.out.println("Set value between 1 and 5 as bug priority!");
        } else {
            this.bugPriority = bugPriority;
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public String getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(String bugStatus) {
        this.bugStatus = bugStatus;
    }

    public void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + "; reported by: " + BugReporter.firstName + " "
                + BugReporter.lastName + ", " + BugReporter.email +
                "; bug priority: " + bugPriority + "; Bug status: " + bugStatus + ".");
    }

    public void showBugReportedBy() {
        System.out.println("Reported by: " + BugReporter);
    }

    public void showBugStatus() {
        System.out.println("model.Bug status: " + bugStatus);
    }

    public void closeBug() {
        this.bugStatus = "closed";
    }


}


