package halusiowanie;


import halusiowanie.PrivateData;

import java.util.Objects;

public class User {
    //Pola klasy
    String name;
    String lastname;
    String mail;
    PrivateData privateData;

    //Konstruktor 11-16                           //Argumenty
    public User(String name, String lastname, String mail, PrivateData privateData) {
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.privateData = privateData;

    }
    //Metoda/funkcja

    public void checkMail(String userMail) {
        if (userMail.equals(this.mail)) {
            System.out.println("Poprawny e-mail!");
        } else {
            System.out.println("Nie ma takiego użytkownika!");
        }
    }

    public void logIn(String userPassword) {
        if (Objects.equals(userPassword, privateData.password)) {
            System.out.println("Udało się zalogować!");
        } else {
            System.out.println("Hasło nie jest takie same, spróbuj ponownie później!");
        }

    }
}


//TODO przyjąć maila i hasło z konsoli i sprawdzić czy jest takie same jak mail i hasło użytkownika
//TODO WYPISAĆ CZY MAIL I HASLO SA POPRAWNE.