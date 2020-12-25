public class switchology {
    public static void main(String[] args) {
        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "Some page";

        switch(page) {
            case "Home":
                System.out.println("I switch to Home page.");
                break;
            case "Login":
                System.out.println("I switch to Login page.");
                break;
            case "Contact":
                System.out.println("I switch to Contact page.");
                break;
            default:
                System.out.println("I don't know this page.");
        }
        System.out.println();
    }
}
