package coditas.utils;

import coditas.cache.MemoryCache;
import coditas.model.Department;
import coditas.model.Employee;

public class MemoryUtil {
    public static MemoryCache<Employee, Department> addData() {
        Employee e1 = new Employee(1009, "Sada", 90000.00, "sada@coditas.com");
        Employee e2 = new Employee(2009, "Rakesh", 30000.00, "rakesh@coditas.com");
        Employee e3 = new Employee(3009, "Aditya", 50000.00, "aditya@coditas.com");
        Employee e4 = new Employee(4009, "Prasad", 70000.00, "prasad@coditas.com");
        Employee e5 = new Employee(5009, "Ajay", 80000.00, "ajay@coditas.com");

        Employee e6 = new Employee(1008, "Jadhav", 190000.00, "sada@coditas.com");
        Employee e7 = new Employee(2008, "Ghonmode", 130000.00, "rakesh@coditas.com");
        Employee e8 = new Employee(3008, "Botre", 150000.00, "aditya@coditas.com");
        Employee e9 = new Employee(4008, "Lengare", 170000.00, "prasad@coditas.com");
        Employee e10 = new Employee(5008, "Jumbad", 180000.00, "ajay@coditas.com");

        Department d1 = new Department(10001, "IT", "Pune");
        Department d2 = new Department(10002, "Finance", "Mumbai");

        MemoryCache<Employee, Department> memoryCache = MemoryCache.newInstance(5);
        memoryCache.put(e1, d1);
        memoryCache.put(e2, d1);
        memoryCache.put(e3, d1);
        memoryCache.put(e4, d2);
        memoryCache.put(e5, d2);
        memoryCache.put(e6, d1);
        memoryCache.put(e7, d1);
        memoryCache.put(e8, d1);
        memoryCache.put(e9, d2);
        memoryCache.put(e10, d2);
        return memoryCache;
    }
}
