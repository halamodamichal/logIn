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
    public void logIn() {
        if (Objects.equals(this.privateData.password, Main.checkPassword())) {
            System.out.println("Udało się zalogować, hasło poprawne!");
        } else {
            System.out.println("Nie udało się zalogować, spróbuj ponownie później!");
        }
        //System.out.println(this.privateData.password);
        //System.out.println(Main.checkPassword());
    }
}


//TODO przyjąć maila i hasło z konsoli i sprawdzić czy jest takie same jak mail i hasło użytkownika
//TODO WYPISAĆ CZY MAIL I HASLO SA POPRAWNE.