public class AlgoMain {


     public static void main(String[] args) {


         //Complexity O(n^2)
         String all_characters = "abcdefghijklmnopqrstuvwxyz";

         String inputAsString = "abc";
         char [] inputAsCharArray = inputAsString.toCharArray();

         int n = 28;
         int limit = 25;


         for(int i=0;i<inputAsCharArray.length;i++){
             char  currentCharacter = inputAsCharArray[i];

            int currentCharacterIndex = all_characters.indexOf(currentCharacter);

             for (int j = 0; j < n; j++) {

                 if(currentCharacterIndex==limit)
                     currentCharacterIndex=0;
                 else
                     currentCharacterIndex++;

             }

             char newCharacter = all_characters.charAt(currentCharacterIndex);

             System.out.print(newCharacter);
         }





    }
}
