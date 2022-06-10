public class reversePrefix {
    public String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch); //make use of String methods to get index value instead of moving a pointer
        if (end == -1){
            return word; //if indexOf is -1 then ch not found
        } else {
            int i = 0; //set up anchor
            char[] arr = word.toCharArray(); //create array out of string ch
            while(i < end){ //switch characters around
                //this would count as using pointers during the character swap, but the initial finding of the ch
                //is much easier using indexOf
                char temp = arr[i];
                arr[i++] = arr[end];
                arr[end--] = temp;
            }
            word = String.valueOf(arr); //reassign word to be the value held in the arr
            return word; //return the result!
        }

    }
}
