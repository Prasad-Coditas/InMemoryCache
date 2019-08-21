package coditas.cache;


    public class CacheObject {
 

        private Object value;
        private long expiryTime;
 
        boolean isExpired() {
            return System.currentTimeMillis() > expiryTime;
        }
    }