package Umiljanovic;

//10. Write a program that automatically converts English text to Morse code and vice versa.


import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("for morse-english translation type ME, for english-morse translation type EM");
        String translation;

        translation=in.nextLine();

        while(translation.equals("ME") && translation.equals("EM")){
            translation = in.nextLine();
        }


        System.out.println("Write your text here: ");
        String text = in.nextLine();

        switch(translation){
            case("ME"): {
                morseEnglishTranslator(text);
                break;}
            case("EM"): {
                englishMorseTranslator(text);
                break;}
        }

    }

    private static void englishMorseTranslator(String text) {

        Dictionary morseCode = new Hashtable();
        morseCode.put('a', ".-");
        morseCode.put('b', "-...");
        morseCode.put('c', "-.-.");
        morseCode.put('d', "-..");
        morseCode.put('e', ".");
        morseCode.put('f', "..-.");
        morseCode.put('g', "--.");
        morseCode.put('h', "....");
        morseCode.put('i', "..");
        morseCode.put('j', ".---");
        morseCode.put('k', "-.-");
        morseCode.put('l', ".-..");
        morseCode.put('m', "--");
        morseCode.put('n', "-.");
        morseCode.put('o', "---");
        morseCode.put('p', ".--.");
        morseCode.put('q', "--.-");
        morseCode.put('r', ".-.");
        morseCode.put('s', "...");
        morseCode.put('t', "-");
        morseCode.put('u', "..-");
        morseCode.put('v', "...-");
        morseCode.put('w', ".--");
        morseCode.put('x', "-..-");
        morseCode.put('y', "-.--");
        morseCode.put('z', "--..");
        morseCode.put(' ', " ");



        char textToConvert[] = text.toCharArray();
        Object convertedTextParts;
        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < textToConvert.length; i++) {

            convertedTextParts = morseCode.get(textToConvert[i]);

            builder.append(convertedTextParts + " ");

        }

        System.out.println(builder);
    }

    private static void morseEnglishTranslator(String text) {

        Dictionary englishCode= new Hashtable();
        englishCode.put(".-",'a');
        englishCode.put( "-...",'b');
        englishCode.put("-.-.",'c');
        englishCode.put("-..",'d');
        englishCode.put(".",'e');
        englishCode.put("..-.",'f');
        englishCode.put("--.",'g');
        englishCode.put("....",'h');
        englishCode.put("..",'i');
        englishCode.put(".---",'j');
        englishCode.put("-.-",'k');
        englishCode.put(".-..",'l');
        englishCode.put("--",'m');
        englishCode.put("-.",'n');
        englishCode.put("---",'o');
        englishCode.put( ".--.",'p');
        englishCode.put("--.-",'q');
        englishCode.put(".-.",'r');
        englishCode.put("...",'s');
        englishCode.put( "-",'t');
        englishCode.put("..-",'u');
        englishCode.put("...-",'v');
        englishCode.put( ".--",'w');
        englishCode.put("-..-",'x');
        englishCode.put("-.--",'y');
        englishCode.put("--..",'z');
        englishCode.put(" ",' ');

        String textToConvert[]= text.split(" ");
        Object convertedText;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < textToConvert.length; i++) {

            convertedText = englishCode.get(textToConvert[i]);

            builder.append(convertedText + " ");

        }

        System.out.println(builder);


    }

}
