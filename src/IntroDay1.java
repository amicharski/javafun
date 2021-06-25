import java.util.Scanner;

public class IntroDay1 {
    public static void main(String[] args){
        newAccount();
        //Challenge: FizzBuzz
    }
    private static void newAccount(){
        boolean next = false;
        System.out.println("Welcome to the User Account registration.");
        Scanner scan = new Scanner(System.in);
        String username = null;
        String password = null;
        String email = null;
        while(!next){
            System.out.println("Username:");
            username = scan.nextLine();
            if(username.length() < 3 || username.length() > 20){
                System.out.println("Your username must be between 3-20 characters in length");
            } else {
                next = true;
            }
        }
        next = false;
        while(!next){
            System.out.println("Password:");
            password = scan.nextLine();
            if(password.length() < 8){
                System.out.println("Your password must be at least 8 characters in length");
            } else {
                next = true;
            }
        }
        next = false;
        while(!next){
            System.out.println("Email:");
            email = scan.nextLine();
            if(!email.contains("@")){
                System.out.println("Your email is invalid");
            } else {
                next = true;
            }
        }
        next = false;
        while(!next){
            System.out.println("Confirm Email:");
            String confirmEmail = scan.nextLine();
            if(!confirmEmail.equals(email)){
                System.out.println("This email does not match the email above");
            } else {
                next = true;
            }
        }
        next = false;
        while(!next){
            System.out.println("Does the following information look the same? (Y or N)\nUsername: " + username + "\nPassword: " + password + "\nEmail: " + email);
            String response = scan.nextLine();
            if(response.equals("Y") || response.equals("y")){
                System.out.println("Congratulations on completing the User Account Registration!");
                next = true;
            } else if(response.equals("N") || response.equals("n")){
                newAccount();
            }
        }
    }
}
