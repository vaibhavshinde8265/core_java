package practice;

public class Login_Verification {
	public static void main(String[] args) {

        boolean usernameCorrect = true;
        boolean passwordCorrect = true;

        if (usernameCorrect) {
            if (passwordCorrect) {
                System.out.println("Login successful");
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Incorrect username");
        }
    }

}
