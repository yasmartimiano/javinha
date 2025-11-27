package introduction;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        String userName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter ur name: ");
        userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        sc.close();
    }
}
