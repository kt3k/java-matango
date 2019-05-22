package org.kt3k.matango;

import java.util.Map;
import java.util.HashMap;

final class Matango {
    static Map<String, String> parse(String str){
        Map<String, String> map = new HashMap<String, String>();

        for (String part: str.split("\\s*,\\s*")) {
            if (part.equals("")) {
                throw new RuntimeException();
            }

            String[] keyValue = part.split("=");
            if (keyValue.length > 2) {
                throw new RuntimeException();
            }

            if (keyValue.length == 1) {
                map.put(keyValue[0], null);
                continue;
            }

            map.put(keyValue[0], keyValue[1]);
        }

        return map;
    }
}
