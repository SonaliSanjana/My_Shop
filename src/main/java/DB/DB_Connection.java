package DB;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class DB_Connection {
    private static DB_Connection instance;

    private List<Customer> connection;

    private DB_Connection(){
        connection=new ArrayList<>();
    }

    public List<Customer> getConnection(){
        return connection;
    }

    public static DB_Connection getInstance(){
        return null==instance?instance=new DB_Connection():instance;
    }
}
