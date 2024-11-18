package O4_PrototypeRegistryImplementation_v1;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private final Map<String,Student> map;

    public StudentRegistry(){
        this.map = new HashMap<>();
    }

    public void register(String key,Student student){
        map.put(key,student);
    }

    public Student get(String key){
        return map.get(key);
    }

}
