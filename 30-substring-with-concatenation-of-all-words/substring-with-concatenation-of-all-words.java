class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s.length() == 0 || words.length == 0) {
            return result;
        }

        int len = words[0].length();
        int totalWords = words.length;
        int strLen = s.length();

        HashMap<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        for (int shift = 0; shift < len; shift++) {

            HashMap<String, Integer> window = new HashMap<>();

            int left = shift;
            int wordsInWindow = 0;

            for (int right = shift; right + len <= strLen; right += len) {

                String word = s.substring(right, right + len);

                if (required.containsKey(word)) {

                    window.put(word,
                            window.getOrDefault(word, 0) + 1);

                    wordsInWindow++;

                    while (window.get(word) > required.get(word)) {

                        String leftWord =
                                s.substring(left, left + len);

                        window.put(leftWord,
                                window.get(leftWord) - 1);

                        left += len;
                        wordsInWindow--;
                    }

                    if (wordsInWindow == totalWords) {

                        result.add(left);

                        String leftWord =
                                s.substring(left, left + len);

                        window.put(leftWord,
                                window.get(leftWord) - 1);

                        left += len;
                        wordsInWindow--;
                    }

                } else {

                    window.clear();
                    wordsInWindow = 0;
                    left = right + len;
                }
            }
        }

        return result;
    }
}