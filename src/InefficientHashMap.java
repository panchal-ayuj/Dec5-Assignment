import java.util.*;
public class InefficientHashMap {
    List<String[]> bucket1 = new ArrayList<>();
    List<String[]> bucket2 = new ArrayList<>();
    List<String[]> bucket3 = new ArrayList<>();

    private String searchBucket(String key, List<String[]> bucket){
        for(int i = 0; i<bucket.size(); i++){
            if(bucket.get(i)[0] == key){
                return bucket.get(i)[1];
            }
        }
        return "";
    }

    void put(String key, String value){
        int keyHash = key.hashCode()%3;
        switch (keyHash){
            case 0:
                bucket1.add(new String[]{key, value});
                break;
            case 1:
                bucket2.add(new String[]{key, value});
                break;
            default:
                bucket3.add(new String[]{key, value});
        }
    }

    String get(String key){
        int keyHash = key.hashCode()%3;
        switch (keyHash){
            case 0:
                return searchBucket(key, bucket1);
            case 1:
                return searchBucket(key, bucket2);
            default:
                return searchBucket(key, bucket3);
        }
    }
}
