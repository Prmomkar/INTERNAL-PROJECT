package sampleproject;


public class Convertocapitalletter {
	public static void main (String[] args) {
//		String msg = "GoodMorning"; 
//		String[] sample = msg.split("");
//		System.out.println(Arrays.toString(sample));
//	}
        String input = "hello world today";  // Original string
        String[] words = input.split(" ");  // Split the string by spaces
        
        // Check if there are at least two words
        if (words.length > 2) {
            words[1] = words[2].toUpperCase();  // Convert the second word to uppercase
        }
        
        // Reassemble the string
        String result = String.join(" ", words);
        System.out.println(result);  // Output will be "hello WORLD today"
}
}
