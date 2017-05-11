/*
 Створіть застосування, що буде декодувати рядки отримані в завданні з кодуванням рядків.
 Наприклад:  Hh9h3e4l2o5  Потрібно перетворити на:    Hhhhhhhhhhhhhheeeellooooo
 Дані для декодування будуть надходити як аргументи командного рядка (лише один рядок).
 Зверніть увагу на перевірку вхідних даних: на вході НЕ може бути null але може бути пустий рядок.
 У випадку пустого рядку на вході Ваше застосування повинно вивести на екран пустий рядок.
 Також на вході можуть бути завідомо некоректні рядки. Наприклад: Hh90helo
 В даному випадку кількість повторів 90, що не допустимо за умовами задачі кодування.
 В такому випадку виведіть на екран порожній рядок.
 В кодованому рядку не повинно бути символів, що повторюються. Наприклад Hhhhhhhhhhhhhheeeellooooo
 В такому випадку виведіть пустий рядок 
 */
/**
 * Write a description of class UnCompressString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnCompressString
{
    /**
     * Constructor for objects of class UnCompressString
     */
    public UnCompressString()
    {
    }

    public static void main(String[] args){
        boolean stringIsCorrect = true;
        boolean charIsNumber = false;
        char previousChar;
        boolean characterIsFirst = true;
        
        StringBuilder uncompressString = new StringBuilder();
        
        if((args == null) || (args.length != 1) || (args[0] == null)) {
            return;
        }
        if(args[0].isEmpty()) {
            System.out.println("");
            return;
        }
        //Block of checking correct of the string and decompress this string, if it correct
        previousChar = args[0].charAt(0);
        for(char ch : args[0].toCharArray()){
            //System.out.print(ch);
            if(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || 
               ch == '8' || ch == '9') {
                if(ch == '0' || ch == '1' || true == characterIsFirst){
                    stringIsCorrect = false;
                    break;
                }
                if(false == charIsNumber){
                    charIsNumber = true;
                }
                else {
                    stringIsCorrect = false;
                    break;
                }
            }
            else {
                if((false == characterIsFirst) && (ch == previousChar)){
                    stringIsCorrect = false;
                    break;
                }
                charIsNumber = false; //reset the flag char is number, when after the first number follow the not number                
            }
            if(true == characterIsFirst){
                uncompressString.append(ch);
            }
            else{
                if(true == charIsNumber) {
                    int countOfChar = Integer.valueOf(String.valueOf(ch));
                    for(int i = 1; i < countOfChar; i++){
                        uncompressString.append(previousChar);
                    }
                }
                else{
                    uncompressString.append(ch);
                }
            }
            characterIsFirst = false;
            previousChar = ch;
        }
        if(false == stringIsCorrect) {
            System.out.println("");
            return;
        }
        
        System.out.println(uncompressString);
    }
}
