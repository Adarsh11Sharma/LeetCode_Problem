import java.util.Scanner;




class FirstOccuranceString {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;

        int hayLen = haystack.length();
        int neeLen = needle.length();

        for (int i = 0; i <= hayLen - neeLen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i+neeLen) .equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String haystack= sc.nextLine();
        String needle= sc.nextLine();

         FirstOccuranceString finder = new FirstOccuranceString(); // create object
        int n = finder.strStr(haystack, needle); 
        System.out.println(n);
    }
}
