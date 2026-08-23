import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // we have to get the Client attributes first

        Scanner scanner = new Scanner(System.in);

        ArrayList<Client> clients = new ArrayList<>();

        Client client = createClient(scanner);



        System.out.println(client.getName());
        System.out.println(client.getSurName());
        System.out.println(client.getPhoneNumber());
        
    }
    public static Client createClient(Scanner scanner) {

        String name;
        String surName;
        String phoneNumber;

        System.out.println("Please, enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your surname");
        surName = scanner.nextLine();

        System.out.println("Enter your phone number so we can contact you");
        phoneNumber = scanner.nextLine();


        return new Client(name, surName, phoneNumber);


    }
}
