package vn.edu.iuh.fit.reponsitories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import vn.edu.iuh.fit.enums.EnumEmployee;
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

    public Employee findById(long id) {
        return em.find(Employee.class, id);
    }

    public void deleteEmp(long id){
        Employee emp = em.find(Employee.class, id);
        emp.setStatus(EnumEmployee.FIRED);
        em.merge(emp);
    }


}
