class Solution {
    public int maxFreqSum(String s) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int maxVowel=0;
        int maxConst=0;
        int[] vowel=new int[5];
        int[] consonant=new int[26];
        Arrays.fill(vowel,0);
        Arrays.fill(consonant,0);
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                if(c=='a')  vowel[0]++;
                else if(c=='e') vowel[1]++;
                else if(c=='i') vowel[2]++;
                else if(c=='o') vowel[3]++;
                else vowel[4]++;

            }
            else{
                int index=c-'a';
                consonant[index]++;
            }
        }
        return Arrays.stream(vowel).max().getAsInt()+Arrays.stream(consonant).max().getAsInt();
        
    }
}