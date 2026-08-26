import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<>();

        // Budoni Menu

       int option = 0;
        while (option != 5) {

            // show menu
            System.out.println("======");
            System.out.println("BUDONI");
            System.out.println("======");
            System.out.println();
            System.out.println("1. Create client");
            System.out.println("2. Show clients");
            System.out.println("3. Search client");
            System.out.println("4. Delete client");
            System.out.println("5. Quit");

            // ask option
            System.out.print("Choose an option: ");
           option = scanner.nextInt();
           scanner.nextLine();

           switch (option) {
               // we have to get the Client attributes first
               case 1:
                   Client client = createClient(scanner);

                   clients.add(client);
                   break;
               case 2:
                   if (clients.isEmpty()) {
                       System.out.println("No clients registered");
                   }
                   else {
                       for (Client currentClient : clients) {
                           System.out.println(currentClient.getName());
                           System.out.println(currentClient.getSurName());
                           System.out.println(currentClient.getPhoneNumber());
                       }
                   }
                   break;
               case 3:
                   String phoneToSearch;

                   System.out.println("Enter the client's phone number to search: ");
                   phoneToSearch = scanner.nextLine();

                   boolean found = false;

                   for (Client currentClient : clients) {
                       if (phoneToSearch.equals(currentClient.getPhoneNumber())) {
                           System.out.println(currentClient.getName());
                           System.out.println(currentClient.getSurName());
                           System.out.println(currentClient.getPhoneNumber());
                           found = true;
                       }
                   }
                   if (!found) {
                       System.out.println("Client not found");
                   }
                   break;
               case 4:
                   String phoneToDelete;

                   System.out.println("Enter the client's phone number to delete: ");
                   phoneToDelete = scanner.nextLine();

                   Client toDelete = null;

                   for (Client currentClient : clients) {
                       if (phoneToDelete.equals(currentClient.getPhoneNumber())) {
                            toDelete = currentClient;
                            break;
                       }
                   }
                   if (toDelete != null) {
                       clients.remove(toDelete);
                       System.out.println("Client deleted successfully");
                   }
                   else {
                       System.out.println("Client not found");
                   }

                   break;
               case 5:
                   System.out.println("Thanks for using this service");
                   break;

           }





        }











        
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
