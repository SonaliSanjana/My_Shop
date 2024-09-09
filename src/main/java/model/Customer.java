package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private String id;
    private String name;
    private String address;
    private Double salary;
    private String contact;
    private LocalDate dob;

    public Customer(String id, String title, String name, String address, Double salary, String contact, LocalDate dob) {
        this.id = id;
        this.name =title+name;
        this.address = address;
        this.salary = salary;
        this.contact = contact;
        this.dob = dob;
    }
}
