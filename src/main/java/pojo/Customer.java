package pojo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer
{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int customer_id;
  private String customer_name;
  private String customer_address;
  private long customer_aadhar;
  private String purpose;
  @OneToMany(mappedBy = "customer")
  private List<Car> car;
 public Customer()
 {
 }
 public Customer(String customer_name, String customer_address, long customer_aadhar, String purpose) {
  this.customer_name = customer_name;
  this.customer_address = customer_address;
  this.customer_aadhar = customer_aadhar;
  this.purpose = purpose;
 }

 public int getCustomer_id() {
  return customer_id;
 }

 public void setCustomer_id(int customer_id) {
  this.customer_id = customer_id;
 }

 public String getCustomer_name() {
  return customer_name;
 }

 public void setCustomer_name(String customer_name) {
  this.customer_name = customer_name;
 }

 public String getCustomer_address() {
  return customer_address;
 }

 public void setCustomer_address(String customer_address) {
  this.customer_address = customer_address;
 }

 public long getCustomer_aadhar() {
  return customer_aadhar;
 }

 public void setCustomer_aadhar(long customer_aadhar) {
  this.customer_aadhar = customer_aadhar;
 }

 public String getPurpose() {
  return purpose;
 }

 public void setPurpose(String purpose) {
  this.purpose = purpose;
 }

 public List<Car> getCar() {
  return car;
 }

 public void setCar(List<Car> car) {
  this.car = car;
 }

}
