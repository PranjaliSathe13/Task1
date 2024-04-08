/*You are given a sentence, write a Java program to replace that word with a new one provided by the user. And print the total number of words present in the given sentence after replacing the first word
*/
import java.util.Scanner;
class ReplaceWord{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sentence:");
String sen=sc.nextLine();

System.out.println("Enter The WOrd to replace:");
String existingWord=sc.next();
System.out.println("Enter The new Word to replace:");
String newWord=sc.next();

String modifiedSentence=sen.replaceFirst(existingWord,newWord);
int wordCount=modifiedSentence.split("\\s+").length;
System.out.println("Modified Sentence:"+ modifiedSentence);
System.out.println("Total number of words:"+wordCount);
sc.close();

}
}