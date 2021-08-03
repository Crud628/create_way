package LC14;

/**
 * 横向对比
 * 
 * @author lan
 * 2021年8月3日
 * TODO
 */
public class fun1 {
	public static void main(String[] args) {
		String[] strs = {"ab","a"};
		String longestCommonPrefix = new fun1().longestCommonPrefix(strs);
		System.out.println(longestCommonPrefix);
	}
	
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String result = "";
        if (n == 0) return result;
        if (n == 1) return strs[0];
        
        for (int i = 0; i < strs[0].length(); i++) {
        	int count = 0;
            for (int j = 0; j < strs.length;j++) {
            	
                if (strs[0].length() < i) {
                	return result;
                }
                if (strs[j].length() < i) {
                	return result;
                }
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                	return result;
                } else {
                	count++;
                }
            }
            if (count == n) {
            	result += strs[0].charAt(i);
            } else {
            	return result;
            }
        }
        return result;
    }
}
