class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for(String str : strs){
            int[] count = new int[26];

            for(char ch : str.toCharArray()){
                count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i : count){
                sb.append(i);
                sb.append("#");
            }

            String key = sb.toString();

            anagrams.putIfAbsent(key , new ArrayList<>());
            anagrams.get(key).add(str);

        }
        return new ArrayList<>(anagrams.values());
    }
}
