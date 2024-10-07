import java.util.Scanner;

public class MadLibs 
{
    public static void main(String[] args) 
    {
        String madLibs = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";

        //Scanners
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a "+ madLibs.substring(madLibs.indexOf("<")+1, madLibs.indexOf(">")) + ": ");
        String userInputOne = scan1.nextLine();
        
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter a "+ madLibs.substring(madLibs.indexOf("<", madLibs.indexOf("<")+ 1 )+1, madLibs.indexOf(">", madLibs.indexOf(">") + 1)) + ": ");
        String userInputTwo = scan2.nextLine();
        
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter a "+ madLibs.substring(madLibs.indexOf("<", madLibs.indexOf("<", madLibs.indexOf("<") + 1 )+ 1 ) + 1, madLibs.indexOf(">", madLibs.indexOf(">", madLibs.indexOf(">") + 1) + 1)) + ": ");
        String userInputThree = scan3.nextLine();
        
        //The full MadLib

        String fullMadLibs = madLibs.substring(0, madLibs.indexOf("<")) + userInputOne + 
        madLibs.substring(madLibs.indexOf(">")+1, madLibs.indexOf("<", madLibs.indexOf("<")+ 1 )) + userInputTwo + 
        madLibs.substring(madLibs.indexOf(">", madLibs.indexOf(">")+1)+ 1, madLibs.indexOf("<", madLibs.indexOf("<", madLibs.indexOf("<")+ 1)+ 1)) + userInputThree + 
        madLibs.substring(madLibs.indexOf(">", madLibs.indexOf(">", madLibs.indexOf(">")+ 1)+ 1)+ 1);
        System.out.println(fullMadLibs);
        

    }

}
