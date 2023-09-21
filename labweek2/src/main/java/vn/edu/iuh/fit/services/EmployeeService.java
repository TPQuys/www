package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.models.Employee;
import vn.edu.iuh.fit.reponsitories.EmployeeReponsitory;

public class EmployeeService {
    private EmployeeReponsitory reponsitory;

    public EmployeeService(){
        reponsitory= new EmployeeReponsitory();
    }

    public void insertEmp(Employee e){
        reponsitory.insertEmp(e);
    }
}
