
// 9-24 3:30
public class NiscInterview {

    public static String compression(String str) throws Exception {
        if (str == null || str.length() == 0) {
            throw new Exception("Must a be a Present String");
        }
        char[] chars = str.toCharArray();
        String finalStr = "";
        Character curCharacter = chars[0];
        int curCount = 0;
        for (int j = 0; j < chars.length; j++) {
            if (curCharacter == chars[j]) {
                curCount++;
            } else {
                finalStr += curCharacter;
                finalStr += curCount;
                curCharacter = chars[j];
                curCount = 1;
            }
        }
        finalStr += curCharacter;
        finalStr += curCount;

        if (finalStr.length() < str.length()) {

            return finalStr;
        } else {
            return str;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(compression("thhhhhtttzz"));
    }

}


