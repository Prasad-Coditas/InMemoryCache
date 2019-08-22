import coditas.cache.MemoryCache;
import coditas.model.Department;
import coditas.model.Employee;
import coditas.utils.MemoryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MemoryCacheApp {
    private static final Logger logger = LoggerFactory.getLogger(MemoryCacheApp.class);

    /*
    MemoryUtil class is used to here to get data to load in cache.
     */
    public static void main(String[] args) {
        MemoryCache<Employee, Department> cache = MemoryUtil.addData();
        logger.info("---> Showing recently cached data as per limit <---");
        cache.entrySet().forEach(entry ->
                logger.info((entry.getKey() + "==>" + entry.getValue()))
        );
        cache.flushCache();
        logger.info("***After Flushing the cache***");
        cache.entrySet().forEach(entry ->
                logger.info((entry.getKey() + "==>" + entry.getValue()))
        );
    }
}
