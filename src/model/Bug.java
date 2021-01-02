package model;

public class Bug {

    private String bugDescription;
    private String bugReportedBy;
    private int bugPriority;
    private String bugStatus;

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if(bugDescription.length() <10){
            System.out.println("Not enough characters!");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getBugReportedBy() {
        return bugReportedBy;
    }

    public void setBugReportedBy(String bugReportedBy) {
        if (bugReportedBy.contains("@")) {
            this.bugReportedBy = bugReportedBy;
        } else {
            System.out.println("Invalid e-mail!");
        }
    }

    public void setBugPriority(int bugPriority) {
        if (bugPriority < 1 || bugPriority > 5) {
            System.out.println("Set value between 1 and 5 as bug priority!");
        } else {
            this.bugPriority = bugPriority;
        }
    }

    public String getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(String bugStatus) {
        this.bugStatus = bugStatus;
    }

    public Bug(String bugDescription, String bugReportedBy, int bugPriority) {
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

    public void showAllBugInfo() {
        System.out.println("model.Bug description: " + bugDescription + "; reported by: " + bugReportedBy +
                "; bug priority: " + bugPriority + "; model.Bug status: " + bugStatus + ".");
    }

    public void showBugReportedBy() {
        System.out.println("Reported by: " + bugReportedBy);
    }

    public void showBugStatus() {
        System.out.println("model.Bug status: " + bugStatus);
    }

    public void closeBug() {
        this.bugStatus = "closed";
    }

    public int getBugPriority() {
        return bugPriority;
    }
}


