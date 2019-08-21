package coditas.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemoryCacheTest<K, V> {

    @Autowired
    private MemoryCache<K, V> memoryCacheUnderTest;

    @BeforeEach
    public void setUp() {
        memoryCacheUnderTest = new MemoryCache<>(2);
    }

    @Test
    public void testClear() {
        // Setup
        // Run the test
        memoryCacheUnderTest.clear();
        int expectedSize=0;
        int tempSize = memoryCacheUnderTest.size();

        // Verify the results
        assertEquals(expectedSize,tempSize);
    }

    @Test
    public void testNewInstance() {
        // Setup
        final int size = 0;
        final MemoryCache<K, V> expectedResult = null;

        // Run the test
        final MemoryCache<K, V> result = MemoryCache.newInstance(size);

        // Verify the results
        assertNotEquals(expectedResult, result);
    }

    @Test
    public void testRemoveEldestEntry(Map.Entry<K, V> eldest){


    }

}
