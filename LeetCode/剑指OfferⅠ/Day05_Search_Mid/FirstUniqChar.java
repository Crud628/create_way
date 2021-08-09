package Day05_Search_Mid;

import java.util.LinkedHashMap;

public class FirstUniqChar {
	public static void main(String[] args) {
		System.out.println(new FirstUniqChar().firstUniqChar("leetcode"));
	}
    public char firstUniqChar(String s) {
        if (s.equals("")) return ' ';
        LinkedHashMap<Character,Integer> hash = new LinkedHashMap<Character, Integer>(); 
        for (int i = 0;i<s.length();i++) {
            if (hash.get(s.charAt(i)) == null) {
            	hash.put(s.charAt(i), 1);
            } else {
            	hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0;i<s.length();i++) {
        	if (hash.get(s.charAt(i)) != null && hash.get(s.charAt(i)) == 1) return  s.charAt(i);
        }
        return ' ';
    	
//        Map<Character, Integer> position = new HashMap<Character, Integer>();
//        Queue<Pair> queue = new LinkedList<Pair>();
//        int n = s.length();
//        for (int i = 0; i < n; ++i) {
//            char ch = s.charAt(i);
//            if (!position.containsKey(ch)) {
//                position.put(ch, i);
//                queue.offer(new Pair(ch, i));
//            } else {
//                position.put(ch, -1);
//                while (!queue.isEmpty() && position.get(queue.peek().ch) == -1) {
//                    queue.poll();
//                }
//            }
//        }
//        return queue.isEmpty() ? ' ' : queue.poll().ch;
//    }
//    class Pair {
//        char ch;
//        int pos;
//
//        Pair(char ch, int pos) {
//            this.ch = ch;
//            this.pos = pos;
//        }
    }
}
