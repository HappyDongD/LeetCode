package 专项练习.栈;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * @author zhang dong
 * @Description https://blog.csdn.net/sgbfblog/article/details/8001651?spm=1001.2101.3001.4242
 * @date 2021/3/11-10:57
 */
public class 前缀表达式转后缀 {
    public static ArrayList<String> toH(String s) {
//          todo  这是错误答案

        char[] chars = s.toCharArray();
        ArrayList<String> strings = new ArrayList<>();
        Deque<Character> deque = new ArrayDeque<>();
        int l = chars.length;
        int i = 0;
        while (i < l) {
            if (chars[i] != ' ') {
                if (chars[i] == '(') {
                    deque.push(chars[i]);
                    i++;
                } else if (chars[i] == ')') {
                    while (!deque.isEmpty() && deque.peek() != '(') {
                        Character pop = deque.pop();
                        strings.add(String.valueOf(pop));
                    }
                    deque.pop();
                    i++;
                } else if (chars[i] >= '0' && chars[i] <= '9') {
                    StringBuilder sb = new StringBuilder();
                    while (i < l && chars[i] >= '0' && chars[i] <= '9') {
                        sb.append(chars[i]);
                        i++;
                    }
                    strings.add(sb.toString());
                } else {
                    Character temp = chars[i];
                    while (!deque.isEmpty() && chechk(deque.peek()) >= chechk(temp)) {
                        strings.add(String.valueOf(deque.pop()));
                    }
                    deque.push(temp);
                    i++;
                }
            } else {
                i++;
            }
        }
        return strings;

    }

    public static int chechk(char c) {
        switch (c) {
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        String s = "3+5/2 ";
        System.out.println(toH(s));
    }
}
