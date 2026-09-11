class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();

        int[] common = new int[26];

        // Count characters of the first word
        for (char c : words[0].toCharArray()) {
            common[c - 'a']++;
        }

        // Compare with every other word
        for (int i = 1; i < words.length; i++) {

            int[] current = new int[26];

            for (char c : words[i].toCharArray()) {
                current[c - 'a']++;
            }

            // Keep the minimum count
            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], current[j]);
            }
        }

        // Create result
        for (int i = 0; i < 26; i++) {
            while (common[i] > 0) {
                res.add(String.valueOf((char) ('a' + i)));
                common[i]--;
            }
        }

        return res;
    }
}