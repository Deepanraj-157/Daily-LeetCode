class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> mid = new HashSet<>(
            Arrays.asList('a','s','d','f','g','h','j','k','l')
        );            
        HashSet<Character> top = new HashSet<>(
            Arrays.asList('q','w','e','r','t','y','u','i','o','p')
        );            
        HashSet<Character> bottom = new HashSet<>(
            Arrays.asList('z','x','c','v','b','n','m')
        );        
        ArrayList<String> list=new ArrayList<>();
        for(String s:words){
            if(top.contains(Character.toLowerCase(s.charAt(0)))){
                int i=0;
                while(i<s.length()){
                    if(!top.contains(Character.toLowerCase(s.charAt(i)))) break;
                    i++;
                }
                if(i==s.length()) list.add(s);

            }
            else if(mid.contains(Character.toLowerCase(s.charAt(0)))){
                int i=0;
                while(i<s.length()){
                    if(!mid.contains(Character.toLowerCase(s.charAt(i)))) break;
                    i++;
                }
                if(i==s.length()) list.add(s); 
            }
            else{
                int i=0;
                while(i<s.length()){
                    if(!bottom.contains(Character.toLowerCase(s.charAt(i)))) break;
                    i++;
                }
                if(i==s.length()) list.add(s);
            }
        }
        String[] res=list.toArray(new String[0]);
        return res;

    }
}