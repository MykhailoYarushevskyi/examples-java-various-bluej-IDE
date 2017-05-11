/*
 Створити застосування, що упакуковуватиме рядки за допомогою алгоритму RLE. 
 У випадку Вашого застосування потрібно замінити послідовніть однакових букв на букву за якою буде 
 слідувати цифра від 2 до 9, що вкаже на кількість повтору символів. Якщо символ зустрівся лише 1 раз то заміну робити
 не потрібно. Регістр символів при заміні враховується. 
 Наприклад, рядок:  Hhhhhhhhhhhhhheeeellooooo  Буде перетворено на:  Hh9h4e4l2o5
 Зверніть увагу: якщо кількість повторів більше 9 то потрібно розбити закодовану інформацію на дві групи. 
 Наприклад: hhhhhhhhhhhh  буде замінено на: h9h3
 Дані для кодування будуть надходити як аргументи командного рядка (лише один рядок). 
 Зверніть увагу на перевірку вхідних даних: на вході НЕ може бути null але може бути пустий рядок. 
 У випадку пустого рядку на вході Ваше застосування повинно вивести на екран пустий рядок.
 */

/**
 * Write a description of class CompressStringBuild here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompressStringBuilder
{
    /**
     * Constructor for objects of class CompressStringBuild
     */
    public CompressStringBuilder()
    {
    }

    public static void main(String[] args){
        int countSameChar = 1;
        StringBuilder compressString = new StringBuilder();

        if((args == null) || (args.length != 1) || (args[0] == null)) {
            return;
        }
        if(args[0].isEmpty()) {
            System.out.println("");
            return;
        }

        for(int i = 0; i < args[0].length();){
            countSameChar = 1;
            int j = i;
            while((j < args[0].length()-1) && (args[0].charAt(j) == args[0].charAt(j+1)) && (countSameChar < 9)){
                countSameChar++;
                j++;
            }
            compressString.append(args[0].charAt(i));
            if(countSameChar != 1){
                //summString += Integer.toString(countSameChar);
                compressString.append(countSameChar); // int convert to String type
            }
            i += countSameChar;
        }
        System.out.println(compressString);
    }
}
