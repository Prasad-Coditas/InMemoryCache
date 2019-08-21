package coditas.utils;

import coditas.cache.MemoryCache;
import coditas.model.Department;
import coditas.model.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemoryUtilTest {

    @Test
    public void testAddData() {
        // Setup
        final MemoryCache<Employee, Department> expectedResult = null;

        // Run the test
        final MemoryCache<Employee, Department> result = MemoryUtil.addData();

        // Verify the results
        assertNotEquals(expectedResult, result);
    }
}
