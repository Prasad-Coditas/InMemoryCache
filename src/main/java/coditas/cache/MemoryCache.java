package coditas.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class MemoryCache<K, V> extends LinkedHashMap<K, V> {

	private int sizeValue;

    public MemoryCache(int size) {
        super(size, 0.75f, true);
        this.sizeValue = size;
    }

    public void flushCache() {
        super.clear();
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > sizeValue;
    }


    public static <K, V> MemoryCache<K, V> newInstance(int size) {
        return new MemoryCache<>(size);
    }
}
