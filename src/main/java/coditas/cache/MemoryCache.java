package coditas.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class MemoryCache<K, V> extends LinkedHashMap<K, V> {

	private int sizeValue;

    /**
     * parametrised constructor
     */
    public MemoryCache(int size) {
        super(size, 0.75f, true);
        this.sizeValue = size;
    }
    /**
     * this method is used to flush the cache
     */
    public void flushCache() {
        super.clear();
    }

    /**
     * @param Map.Entry<K, V>
     * this method is overridden and remove the eldest node from the cache
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > sizeValue;
    }

    /**
     * @param size
     * this method is for checking the size of cache whenever new node is supposed to add
     */
    public static <K, V> MemoryCache<K, V> newInstance(int size) {
        return new MemoryCache<>(size);
    }
}
