package vn.edu.iuh.fit.reponsitories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import vn.edu.iuh.fit.enums.EnumEmployee;
import vn.edu.iuh.fit.models.Employee;

public class EmployeeReponsitory {
    private EntityManager em;
    private EntityTransaction trans;

    public EmployeeReponsitory(){
        em = Persistence
                .createEntityManagerFactory("labweek2")
                .createEntityManager();
        trans = em.getTransaction();
    }

    public void insertEmp(Employee e){
        trans.begin();
        em.persist(e);
        trans.commit();
    }

    public Employee findById(long id) {
        return em.find(Employee.class, id);
    }

    public void deleteEmp(long id){
        Employee emp = em.find(Employee.class, id);
        emp.setStatus(EnumEmployee.FIRED);
        em.merge(emp);
    }
}
