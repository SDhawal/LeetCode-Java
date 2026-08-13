// Question: Given two strings s and t, return true if t is an anagram of s, and false otherwise. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

class Solution{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26]; 
        for(int i = 0; i< s.length(); i++){
            count[s.charAt(i) - 'a']++; // increment the count of the character in s
            count[t.charAt(i) - 'a']--; // decrement the count of the character in t
        }
        for (int i =0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;
    }
}

// Time Complexity: O(n) where n is the length of the strings s and t. We iterate through both strings once to count the characters, and then we iterate through the count array of size 26 to check if all counts are zero.