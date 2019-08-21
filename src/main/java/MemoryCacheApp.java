import coditas.cache.MemoryCache;
import coditas.model.Department;
import coditas.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MemoryCacheApp {
    private static final Logger logger = LoggerFactory.getLogger(MemoryCacheApp.class);
    public static void main(String[] args) {
        Employee e1 = new Employee(1009, "Sada", 90000.00, "sada@coditas.com");
        Employee e2 = new Employee(2009, "Rakesh", 30000.00, "rakesh@coditas.com");
        Employee e3 = new Employee(3009, "Aditya", 50000.00, "aditya@coditas.com");
        Employee e4 = new Employee(4009, "Prasad", 70000.00, "prasad@coditas.com");
        Employee e5 = new Employee(5009, "Ajay", 80000.00, "ajay@coditas.com");

        Department d1 = new Department(10001, "IT", "Pune");
        Department d2 = new Department(10002, "Finance", "Mumbai");

        MemoryCache<Employee, Department> cache = MemoryCache.newInstance(2);
        
        cache.put(e1, d1);
        cache.put(e2, d1);
        cache.put(e3, d1);

        cache.put(e4, d2);
        cache.put(e5, d2);

        logger.info("\nShowing most cached data as per limit");
        cache.entrySet().forEach(entry -> {
            logger.info((entry.getKey() + "==>" + entry.getValue()));
        });
        cache.flushCache();
        logger.info("\nAfter Flushing the cache");

        cache.entrySet().forEach(entry -> {
            logger.info((entry.getKey() + "==>" + entry.getValue()));
        });

    }
}
