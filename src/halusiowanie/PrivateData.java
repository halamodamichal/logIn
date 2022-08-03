package halusiowanie;

public class PrivateData {
    String password;
    int numberPhone;
    int age;

    public PrivateData(String password, int numberPhone, int age) {
        this.password = password;
        if (password.length() > 8) {
            System.out.println("Haslo nie może być dłuższe niż 8 znaków, ustawiam '12345678'");
            this.password = "12345678";
        }
        this.numberPhone = numberPhone;
        this.age = age;
        if (age > 100) {
            System.out.println("Wiek nie może być większy od 100, ustawiam wartość maksymalną 100");
            this.age = 100;
        }
        }
    }

    //TODO Sprawdzić hasło czy jest większe niż 8 znaków, jeśli nie jest ustawić 12345678



