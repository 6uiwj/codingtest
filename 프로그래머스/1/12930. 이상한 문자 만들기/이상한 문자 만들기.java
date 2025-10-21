class Solution {
    public String solution(String s) {
        s=s.toLowerCase();
     String[] words = s.split(" ", -1);

        String newWords = "";
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<word.length();i++){
                if(i%2==0) {
                  char temp = Character.toUpperCase(word.charAt(i));
                  sb.append(temp);
                } else { sb.append(word.charAt(i));}

            }
            newWords+= sb + " ";
        }
            return newWords.substring(0,newWords.length()-1);
    }
}