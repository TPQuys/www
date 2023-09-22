package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "order_date",nullable = false)
    private Date date;
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee empId;

    public Order() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmpId() {
        return empId;
    }

    public void setEmpId(Employee empId) {
        this.empId = empId;
    }

    public Order(long id, Date date, Employee empId) {
        this.id = id;
        this.date = date;
        this.empId = empId;
    }


}
