package halusiowanie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Zmienna user1 przechowująca obiekt klasy User
        User user1 = new User("Janek", "Kowalski", "jan.kowalski@o2.pl", new PrivateData("dupa1", 2341, 18));
        User user2 = new User("Michal", "Laskowski", "michal23334@wp.pl", new PrivateData("dupa2", 4123, 26));
        User user3 = new User("Patrycja", "Konieczna", "patka222@gmail.com", new PrivateData("dupa3213123", 976, 140));


        user1.logIn();


    }

    public static String checkPassword() {
        Scanner getPassword = new Scanner(System.in);
        System.out.println("Podaj haslo:");
        String passwordForCheck = getPassword.nextLine();
        return passwordForCheck;
    }
}

//1.Stworzyć ręcznie obiekt użytkownika.
//2.Pobrać dane logowania od użytkownika.
//3.Wykorzystać te dane i zalogować użytkownika
//4.Pobieranie danych użytkownika w metodzie.