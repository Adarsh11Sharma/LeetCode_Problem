


class FirstOccuranceString {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;

        int hayLen = haystack.length();
        int neeLen = needle.length();

        for (int i = 0; i <= hayLen - neeLen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.regionMatches(i, needle, 0, neeLen)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack= "LEETCODE";
        String needle= "abc";

         FirstOccuranceString finder = new FirstOccuranceString(); // create object
        int n = finder.strStr(haystack, needle); 
        System.out.println(n);
    }
}
