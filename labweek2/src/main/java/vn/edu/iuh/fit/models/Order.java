package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "order_date",nullable = false)
    private String Odate;
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

    public String getOdate() {
        return Odate;
    }

    public void setOdate(String odate) {
        Odate = odate;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", Odate='" + Odate + '\'' +
                ", empId=" + empId +
                '}';
    }
}
