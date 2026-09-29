package strings;

//Problem: Count vowels and consonants
public class CountVowelAndConsonants {
    public static void main(String[] args) {

        String input= "Automation Testing";

        String lower = input.toLowerCase();


        int vowels = 0;
        int consonants =0;

        for(int i =0; i<lower.length();i++ ){

            char j = lower.charAt(i);

            if(j=='a'|| j=='e'|| j=='i'||j=='o'||j=='u'){

                vowels++;

            }else if (Character.isLetter(j)) {
                consonants++;
            }
        }
        System.out.println("count of  vowels "+vowels);
        System.out.println("count of  consonants "+consonants);

    }
}
