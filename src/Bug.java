public class Bug {

        String bugDescription;
        String bugReportedBy;
        int bugPriority;
        String bugStatus;

        Bug(String bugDescription, String bugReportedBy, int bugPriority){
            this.bugDescription = bugDescription;
            this.bugReportedBy = bugReportedBy;

            if (bugPriority < 1) {
                this.bugPriority = 1;
            } else if (bugPriority > 5){
                this.bugPriority = 5;
            } else {
                this.bugPriority = bugPriority;
            }
            this.bugStatus = "open";
        }

        void getAllInfo() {
            System.out.println(bugDescription + "; " + bugReportedBy + "; " + bugPriority + "; " + bugStatus);
        }
        void getBugReportedBy() {
            System.out.println(bugReportedBy);
        }
        void getBugStatus(){
            System.out.println(bugStatus);
        }
        void closeBug(){
            this.bugStatus = "closed";
        }
        int getBugPriority(){
            return bugPriority;
        }
    }

