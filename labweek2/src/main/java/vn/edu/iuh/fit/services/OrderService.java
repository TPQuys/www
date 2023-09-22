package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.models.Order;
import vn.edu.iuh.fit.reponsitories.OrderReponsitory;

import java.util.Date;
import java.util.List;

public class OrderService {
    private OrderReponsitory reponsitory;

    public OrderService(){
        reponsitory= new OrderReponsitory();
    }

    public void insertOrder(Order e){
        reponsitory.insertOrder(e);
    }

    public Order getOrderById( long id) {
        return reponsitory.findById(id);
    }

    public void updateOrder(Order o, Date date){
        reponsitory.updateOrder(o,date);
    }

    public List<Order> getOrderByDate(Date date){
        return reponsitory.getOrdersByDate(date);
    }
}
