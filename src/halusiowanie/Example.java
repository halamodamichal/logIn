package halusiowanie;

public class Example {

    // Pobierz dane i sprawdź z której bazy dany są
    public void checkData(String data) {
        if (data.equals("example data from database 1")) {
            System.out.println("database 1");
        } else if (data.equals("another data from database 2")) {
            System.out.println("database 2");
        } else {
            System.out.println("no database");
        }
    }

}

class Database {

    // Pobierz dane z podanej bazy danych
    public String readDataFromDatabase(String databaseName) {
        if (databaseName.equals("1")) {
            return "example data from database 1";
        } else if (databaseName.equals("2")) {
            return "another data from database 2";
        } else {
            return "no such database";
        }
    }
}