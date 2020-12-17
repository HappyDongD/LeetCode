package 每日;

import java.util.HashMap;

class Code290单词规律 {
    public boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        String[] str = s.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < str.length; i++) {
            char key = p[i];
            String value = str[i];
            if (!map.containsKey(key)) {
                if (map.containsValue(value)) {
                    return false;
                } else {
                    map.put(p[i], str[i]);
                }
            } else if (!map.get(key).equals(value)){
                return false;
            }
        }
        return true;
    }
}