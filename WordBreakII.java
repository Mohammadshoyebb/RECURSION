// Question: 140. Word Break II
// Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.
// Note that the same word in the dictionary may be reused multiple times in the segmentation.
//
// Example 1:
// Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
// Output: ["cats and dog","cat sand dog"]
//
// Example 2:
// Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
// Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
// Explanation: Note that you are allowed to reuse a dictionary word.
//
// Example 3:
// Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
// Output: []
//
// Constraints:
// 1 <= s.length <= 20
// 1 <= wordDict.length <= 1000
// 1 <= wordDict[i].length <= 10
// s and wordDict[i] consist of only lowercase English letters.
// All the strings of wordDict are unique.
// Input is generated in a way that the length of the answer doesn't exceed 105.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakII {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        Set<String> words = new HashSet<>(wordDict);
        solve(0, s, new ArrayList<>(), ans, words);
        return ans;
    }

    private void solve(int start, String s, List<String> curr, List<String> ans, Set<String> words) {
        if (start == s.length()) {
            ans.add(String.join(" ", curr));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (words.contains(s.substring(start, end + 1))) {
                curr.add(s.substring(start, end + 1));
                solve(end + 1, s, curr, ans, words);
                curr.remove(curr.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        WordBreakII solution = new WordBreakII();

        String s1 = "catsanddog";
        List<String> wordDict1 = List.of("cat", "cats", "and", "sand", "dog");
        System.out.println(solution.wordBreak(s1, wordDict1));  // Output: ["cats and dog", "cat sand dog"]

        String s2 = "pineapplepenapple";
        List<String> wordDict2 = List.of("apple", "pen", "applepen", "pine", "pineapple");
        System.out.println(solution.wordBreak(s2, wordDict2));  // Output: ["pine apple pen apple", "pineapple pen apple", "pine applepen apple"]

        String s3 = "catsandog";
        List<String> wordDict3 = List.of("cats", "dog", "sand", "and", "cat");
        System.out.println(solution.wordBreak(s3, wordDict3));  // Output: []
    }
}

