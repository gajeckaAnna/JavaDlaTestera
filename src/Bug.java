public class Bug {

    String bugDescription;
    String bugReportedBy;
    int bugPriority;
    String bugStatus;

    Bug(String bugDescription, String bugReportedBy, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReportedBy = bugReportedBy;

        if (bugPriority < 1) {
            this.bugPriority = 1;
        } else if (bugPriority > 5) {
            this.bugPriority = 5;
        } else {
            this.bugPriority = bugPriority;
        }

        this.bugStatus = "open";
    }

    void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + "; reported by: " + bugReportedBy +
                "; bug priority: " + bugPriority + "; Bug status: " + bugStatus + ".");
    }

    void showBugReportedBy() {
        System.out.println("Reported by: " + bugReportedBy);
    }

    void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
    }

    void closeBug() {
        this.bugStatus = "closed";
    }

    int getBugPriority() {
        return bugPriority;
    }
}


