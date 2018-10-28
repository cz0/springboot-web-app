package hello;

import java.util.HashMap;
import java.util.Map;

public class Notification {
    private String content;

    public String getContent() {
        return this.content;
    }

    public Map<String, String> toMap() {
        Map<String, String> map= new HashMap<>();
        map.put("content", getContent());
        return map;
    }
}
