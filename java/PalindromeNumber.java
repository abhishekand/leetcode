class Solution {
    public boolean isPalindrome(int x) {
        int rem, value = 0, temp ;
        temp = x;
        while(x>0){
        rem = x % 10;
        value =( value * 10 ) + rem;
        x = x / 10;
        }
        if(temp == value ){
            return true;
        }
        else{
            return false;
        }
    }
}