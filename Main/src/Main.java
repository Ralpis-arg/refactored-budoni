import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<>();

        // Budoni Menu

       int option = 0;
        while (option != 3) {

            // show menu
            System.out.println("======");
            System.out.println("BUDONI");
            System.out.println("======");
            System.out.println();
            System.out.println("1. Create client");
            System.out.println("2. Show clients");
            System.out.println("3. Quit");

            // ask option
            System.out.print("Choose an option: ");
           option = scanner.nextInt();
           scanner.nextLine();

           // correct this
           switch (option) {
               case 1:
                   Client client = createClient(scanner);

                   clients.add(client);
                   break;
               case 2:
                   for (Client currentClient : clients) {
                       System.out.println(currentClient.getName());
                       System.out.println(currentClient.getSurName());
                       System.out.println(currentClient.getPhoneNumber());
                   }
                   break;

           }




        }

        // we have to get the Client attributes first









        
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
