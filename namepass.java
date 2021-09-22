import java.util.Scanner;

class UsernameException extends Exception {

    public UsernameException(String sts) {
        System.out.print(sts);
    }
}

class PasswordException extends Exception {

    public PasswordException(String sts) {
        System.out.print(sts);
    }
}

public class namepass {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username, password;

        System.out.print("Enter username: ");
        username = reader.nextLine();
        System.out.print("Enter password: ");
        password = reader.nextLine();
        int len = username.length();
        try {
            if(len < 8)
                throw new UsernameException("Username must be greater than 8 characters");
            else if(!password.equals("admin"))
                throw new PasswordException("Incorrect password");
            else
                System.out.println("Login Successful");
        }
        catch (UsernameException u) {
              System.out.println(u);
        }
        catch (PasswordException p) {
           System.out.println(p);
        }
    }
}
