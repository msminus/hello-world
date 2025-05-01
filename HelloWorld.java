public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Welcome to Github in VSCode server");

        ContactDetails cDetails = new ContactDetails();
        cDetails.setEmail("msminus2017@gmail.com");
        cDetails.setName("Subrahmanyam Mamidi");

        System.out.println(cDetails.getEmail() + " \n " + cDetails.getName());
        System.out.println("Calling external class is over");

        System.out.println("Staged and Modified");
        //Git recognizes as exting file and is updated. Showing "M".
        //In the begining it showed as "U" untracking
        //After adding to staged it showed "A"
        //Checking If this is present in Git
    }
}
