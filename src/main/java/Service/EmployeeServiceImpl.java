package Service;

import Model.Employee;
import Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmloyees() {
        return  employeeRepository.findAll();

    }
}
