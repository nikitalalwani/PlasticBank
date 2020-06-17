/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, String email, String address, Date dob, int age){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAddress(address);
        employee.setDob(dob);
        employee.setAge(age);
        employee.setEmail(email);
        employeeList.add(employee);
        return employee;
    }
    
     public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        
        employeeList.add(employee);
        return employee;
    }
     
//     public boolean checkIfEmployeeExists(String username, ArrayList<Employee> list)
//     {
//     for(Employee e : list)
//     {
//     if(e.)
//     }
//     return true;
//     }
}