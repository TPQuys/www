package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.enums.EnumEmployee;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private String employeeId;
    @Column(name = "full_name", length = 200,nullable = false)
    private String fullName;
    @Column(length = 150,nullable = false)
    private String dob;
    @Column(length = 150,unique = true)
    private String email;
    @Column(length = 15,nullable = false)
    private String phone;
    @Column(length = 300,nullable = false)
    private String address;
    @Column(name = "status",nullable = false)
    private EnumEmployee status;

    @OneToMany(mappedBy = "empId")
    private List<Order> dsOr;

    public Employee(String fullName, String dob, String email, String phone, String address, EnumEmployee statu) {
        this.fullName = fullName;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = statu;
    }

    public Employee() {

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EnumEmployee getStatus() {
        return status;
    }

    public void setStatus(EnumEmployee status) {
        this.status = status;
    }


}
