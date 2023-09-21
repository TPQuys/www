package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail {
    @Id
    @OneToOne()
    @JoinColumn (name = "order_id")
    private Order id;

    @JoinColumn(name = "product_id",nullable = false)
    private Product productId;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private double price;


}
