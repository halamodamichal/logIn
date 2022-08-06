package halusiowanie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Zmienna user1 przechowująca obiekt klasy User
        User user1 = new User("Janek", "Kowalski", "jan.kowalski@o2.pl", new PrivateData("dupa1", 2341, 18));
        User user2 = new User("Michal", "Laskowski", "michal23334@wp.pl", new PrivateData("dupa2", 4123, 26));
        User user3 = new User("Patrycja", "Konieczna", "patka222@gmail.com", new PrivateData("dupa3213123", 976, 140));
        String userPassword = checkPassword();
        String userMail = checkMail();
        user1.checkMail(userMail);
        user1.logIn(userPassword);
    }

    public static String checkMail() {
        Scanner getMail = new Scanner(System.in);
        System.out.println("Podaj adres e-mail:");
        String userMail = getMail.nextLine();
        return userMail;
    }

    public static String checkPassword() {
        Scanner getPassword = new Scanner(System.in);
        System.out.println("Podaj haslo:");
        String userPassword = getPassword.nextLine();
        return userPassword;
    }
}









//1.Stworzyć ręcznie obiekt użytkownika.
//2.Pobrać dane logowania od użytkownika.
//3.Wykorzystać te dane i zalogować użytkownika
//4.Pobieranie danych użytkownika w metodzie.


    // 1. Stwórz ręcznie obiekt Example
  //  Example example = new Example();
    // 2. Pobierz dane z bazy danych
  //  String data = getData();
// 3. Sprawdź z której bazy są dane
     //   example.checkData(data);
// Zmienna nazywa się data, ale może nazywać
// się inaczej - nie musi być taka sama nazwa jak argument w
// Example:linia 6

  /*  public static String getData() {
        Database database = new Database();
        return database.readDataFromDatabase("1");
    }*/