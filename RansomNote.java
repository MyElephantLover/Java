class Solution{
    public boolean CanConstruct(String ransomNote, String magazine){
        for (int i = 0; i < ransomNote.length(); i ++){
            char r = magazine.charAt(i);

            int matchingIndex = magazine.indexOf(r); // indexOf returns -1 if no matching index
            if (matchingIndex == -1){
                return false;
            }
            // we create a copy of the string magazine whenever we remove a letter from it
            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
        }
        return true;
    } 
    // Time Complexity = O(nm); // go through each respective String
    // Space Complexity = O(n)
}