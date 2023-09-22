package vn.edu.iuh.fit.reponsitories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import vn.edu.iuh.fit.models.Order;

import java.util.Date;
import java.util.List;

public class OrderReponsitory {
    private EntityManager em;


    public OrderReponsitory(){
        em = Persistence
                .createEntityManagerFactory("labweek2")
                .createEntityManager();
    }

    public void insertOrder(Order o){
        em.persist(o);
    }

    public Order findById(long id) {
        return em.find(Order.class, id);
    }

    public void updateOrder(Order o, Date date){
        o.setDate(date);
        em.merge(o);
    }

    public List<Order> getOrdersByDate(Date date) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Order> cq = cb.createQuery(Order.class);
        Root<Order> root = cq.from(Order.class);
        cq.where(cb.equal(root.get("order_date"), date));

        TypedQuery<Order> query = em.createQuery(cq);
        return query.getResultList();
    }
}
