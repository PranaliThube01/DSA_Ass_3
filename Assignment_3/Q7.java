class demo {

     static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
	    }
            start++;
            end--;
        }
        return true;
    }

 static String firstPalindrome(String[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (isPalindrome(arr[i])) {
                return arr[i]; 
            }
            i++;
        }
        return "No palindrome found"; 
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "level", "java"};
        String firstPal = firstPalindrome(words);
        System.out.println("First palindrome: " + firstPal);
    }
}

