import coditas.cache.MemoryCache;
import coditas.model.Department;
import coditas.model.Employee;
import coditas.utils.MemoryUtil;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemoryCacheAppTest {

    @Test
    public void testMain() {
        // Setup
        final String[] args = new String[]{};

        MemoryCache<Employee, Department> emptyCache = null;
        MemoryCache<Employee, Department> cache = MemoryUtil.addData();

        // Run the test
        MemoryCacheApp.main(args);

        // Verify the results
        assertNotEquals(emptyCache,cache);
        assertNotNull(cache);
    }
}
