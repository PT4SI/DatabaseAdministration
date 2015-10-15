/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseServlet;

/**
 *
 * @author ckc
 */
public class Employee {

    private int id;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    private String firstname;
    private String lastname;
    private String birthdate;
    private String salary;

    Employee() {
    }

    Employee(int id) {
        this.id = id;
    }
//Constructor for Employee class which implement the value id, firstname, lastname, birthdate,salary 

    Employee(int id, String firstname, String lastname, String birthdate, String salary) {

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
// Provide GET, SET method for the variable “firstname”, “lastname”, “birthdate” and “salary” with data type String
    

}
