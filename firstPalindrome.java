public class firstPalindrome {
    public String fp(String[] words){
        for (String str : words){
            int i = 0; //anchor pointer
            int j = str.length()-1; //comparison pointer
            if(i == j){ //check if 1 char string
                return str; //if so then is palindrome
            }
            while(i < str.length()){ //while i(anchor) has not reached end of string
                if(str.charAt(i) == str.charAt(j)){ //if i == j
                    i+=1; //move i forward
                    j-=1; //move j backward
                    if(i == str.length()-1){ //if i is at last index return your result (Handles 2 char strings)
                        return str;
                    }
                } else {
                    break; //break the loop if there's no match
                }
                if(i == j){ //if i == j then the pointers met in middle... return result
                    return str;
                }
            }

        }
        return ""; //if a result has not been found yet then return "" no palindromes
    }
}
