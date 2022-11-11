package pojo;

import javax.persistence.*;

@Entity
public class Car
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int car_id;
    private String car_name;
    private String model_name;
    private int car_price;
    private int availability;
    private int token_price;
    @ManyToOne
    private Customer customer;


    public Car() {
    }

    public Car(String car_name, String model_name, int car_price, int availability, int token_price) {
        this.car_name = car_name;
        this.model_name = model_name;
        this.car_price = car_price;
        this.availability = availability;
        this.token_price = token_price;
    }

    public int getCar_id()
    {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getCar_price() {
        return car_price;
    }

    public void setCar_price(int car_price) {
        this.car_price = car_price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getToken_price() {
        return token_price;
    }

    public void setToken_price(int token_price) {
        this.token_price = token_price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
