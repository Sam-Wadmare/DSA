class Solution {
    public boolean rotateString(String s, String goal) {
        String str = s+s;
        if(str.contains(goal) && s.length()==goal.length()){
            return true;
        }
        return false;
    }
}