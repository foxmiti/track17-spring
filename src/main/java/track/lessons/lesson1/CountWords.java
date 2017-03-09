package track.lessons.lesson1;

import java.io.*;

/**
 * Задание 1: Реализовать два метода
 *
 * Формат файла: текстовый, на каждой его строке есть (или/или)
 * - целое число (int)
 * - текстовая строка
 * - пустая строка (пробелы)
 *
 *
 * Пример файла - words.txt в корне проекта
 *
 * ******************************************************************************************
 *  Пожалуйста, не меняйте сигнатуры методов! (название, аргументы, возвращаемое значение)
 *
 *  Можно дописывать новый код - вспомогательные методы, конструкторы, поля
 *
 * ******************************************************************************************
 *
 */
public class CountWords {

    /**
     * Метод на вход принимает объект File, изначально сумма = 0
     * Нужно пройти по всем строкам файла, и если в строке стоит целое число,
     * то надо добавить это число к сумме
     * @param file - файл с данными
     * @return - целое число - сумма всех чисел из файла
     */
    int intAnswer; // default answer
    public long countNumbers(File file) throws Exception {
        FileReader fr = new FileReader(file); // load file in reader
        BufferedReader reader = new BufferedReader(fr); // read string in buffer
        String line = reader.readLine(); // load string in line
        while((line != null)){ // if line is null end circle and return 0
            if(line.isEmpty()){  // if line ecuals empty run this
                line = reader.readLine(); // take new string in line
                continue; // next count of circle
            }
            try { // if line take integer
                intAnswer += Integer.parseInt(line); // sub line with answer
            }  catch(NumberFormatException e){ // when line not integer
                line = reader.readLine(); // take new string line
                continue; // next count of circle
            }
         line = reader.readLine(); // take new string line
        }
        return intAnswer; // return answer
        }




    /**
     * Метод на вход принимает объект File, изначально результат= ""
     * Нужно пройти по всем строкам файла, и если в строка не пустая и не число
     * то надо присоединить ее к результату через пробел
     * @param file - файл с данными
     * @return - результирующая строка
     */
    String lineAnswer = ""; // default answer
    public String concatWords(File file) throws Exception {
        FileReader fr = new FileReader(file); // load file in reader
        BufferedReader reader = new BufferedReader(fr); // read string in buffer
        String line = reader.readLine(); // load string in line
        while((line != null)){ // if line is null end circle and return 0
           // System.out.println(line);  // debug
           // System.out.println(lineAnswer); // debug
            if(line.isEmpty()){  // if line equal empty run this
                line = reader.readLine(); // take new string in line
                continue; // next count of circle
             }
            try { // if line take integer
                Integer.parseInt(line); //
            }  catch(NumberFormatException e){ // catch exception
                lineAnswer = lineAnswer + " " + line ; // add words in line and add space firstly
                //line = reader.readLine();
                //continue;
            }
            line = reader.readLine(); // take new string in line

        }
        return lineAnswer.trim(); // return answer
    }

}
