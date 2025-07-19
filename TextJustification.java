import java.util.List;

class Solution{
    public List<String> fullJustify(String[] words, int maxWidth){
        // create two helper functions, getWords and createLine
        // use the while loop to iterate over the input
        // for each iteration, do the following
        // while i < words.length, get the words that should be on the current line
        // increment i by currentLine.length
        // create the line by calling createLine(line, i) and add it to ans 
        // return ans

        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < words.length){
            List<String> currentLine = getWords(i, words, maxWidth);
            i += currentLine.size();
            ans.add(createLine(currentLine, i, words, maxWidth));
        }

        return ans;
    }

    private List<String> getWords(int i, String[] words, int maxWidth){
        List<String> currentLine = new ArrayList<>();
        int currLength = 0;
        while (i < words.length && currLength + words[i].length() <= maxWidth ){
            currentLine.add(words[i]);
            currLength += words[i].length() + 1;
            i ++;
        }

        return currentLine;
    }

    private String createLine(
        List<String> line,
        int i,
        String[] words,
        int maxWidth
    ){
        int baseLength = -1;
        for (String word : line){ // this is for each loop that iterate over each element in the line list
            baseLength += word.length() + 1;
        }

        int extraSpaces = maxWidth - baseLength;
        if (line.size() == 1 || i == words.length){
            return String.join(" ") + " ".repeat(extraSpaces);
        }

        int wordCount = line.size() - 1;
        int spacesPerWord = extraSpaces / wordCount;
        int needExtraSpace = extraSpaces % wordCount;

        for (int j = 0 ; j < needExtraSpace; j ++) { // not the last line
            line.set(j, line.get(j) + " ");
        }

        for (int j = 0; j < wordCount; j ++){
            line.set(j, line.get(j) + " ".repeat(spacesPerWord));
        }
        return String.join(" ", line);
    }
}

// Time Complexity: O(n * k), n is the words.length, k being the average
// length of each word, and m is the maxWidth

// Space Complexity: O(m)