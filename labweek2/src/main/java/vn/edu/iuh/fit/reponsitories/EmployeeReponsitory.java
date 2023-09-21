package vn.edu.iuh.fit.reponsitories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import vn.edu.iuh.fit.models.Employee;

public class EmployeeReponsitory {
    private EntityManager em;


    public EmployeeReponsitory(){
        em = Persistence
                .createEntityManagerFactory("labweek2")
                .createEntityManager();
    }

    public void insertEmp(Employee e){
        em.persist(e);
    }
}
