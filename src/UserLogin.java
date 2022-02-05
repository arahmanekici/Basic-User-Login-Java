import java.util.Scanner;
public class UserLogin {
    static public void main(String[] args){
        Scanner input = new Scanner (System.in);
        String userName,password;
        System.out.println("Username: ");
        userName= input.nextLine();
        System.out.println("Password: ");
        password= input.nextLine();


        if (userName.equals("abdurrahman") && password.equals("123456789"))
        { System.out.println("Login Succesfully ");

        }
        else { System.out.println("Wrong Username or Password ! Please try again. ");}


    }
}
