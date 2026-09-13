class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] arr = new int[26];
            for (char ch : strs[i].toCharArray()) {
                int resolvedIndex = ch - 97;
                arr[resolvedIndex] += 1;
            }
            String key = Arrays.toString(arr);
            List<String> listOfString = map.getOrDefault(key, new ArrayList<>());
            listOfString.add(strs[i]);
            map.put(key, listOfString);
        }
        return new ArrayList<>(map.values());
    }
}
