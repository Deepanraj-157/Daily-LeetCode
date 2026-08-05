class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray=s.toCharArray();
        Arrays.sort(charArray);
        s=new String(charArray);
        charArray=t.toCharArray();
        Arrays.sort(charArray);
        t=new String(charArray);
        if(s.equals(t)) return true;
        System.out.print(s+" "+t);
        return false;
        
    }
}