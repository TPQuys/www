package vn.edu.iuh.fit.reponsitories;

import vn.edu.iuh.fit.enums.EnumEmployee;
import vn.edu.iuh.fit.models.Employee;

public class test {
    public static void main(String[] args) {
        EmployeeReponsitory er = new EmployeeReponsitory();
        Employee e=new Employee("asd","asd","w","qwe","qeqw", EnumEmployee.ACTIVE);
//        er.insertEmp();
//
        System.out.println(e);
    }


}
