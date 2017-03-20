package track.lessons.lesson1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Задание 1: Реализовать два метода
 * <p>
 * Формат файла: текстовый, на каждой его строке есть (или/или)
 * - целое число (int)
 * - текстовая строка
 * - пустая строка (пробелы)
 * <p>
 * <p>
 * Пример файла - words.txt в корне проекта
 * <p>
 * ******************************************************************************************
 * Пожалуйста, не меняйте сигнатуры методов! (название, аргументы, возвращаемое значение)
 * <p>
 * Можно дописывать новый код - вспомогательные методы, конструкторы, поля
 * <p>
 * ******************************************************************************************
 */
public class CountWords {

    /**
     * Метод на вход принимает объект File, изначально сумма = 0
     * Нужно пройти по всем строкам файла, и если в строке стоит целое число,
     * то надо добавить это число к сумме
     *
     * @param file - файл с данными
     * @return - целое число - сумма всех чисел из файла
     */
    long LongAnswer;
    /**
     * Метод на вход принимает объект File, изначально результат= ""
     * Нужно пройти по всем строкам файла, и если в строка не пустая и не число
     * то надо присоединить ее к результату через пробел
     *
     * @param file - файл с данными
     * @return - результирующая строка
     */
    StringBuilder lineAnswer = new StringBuilder("");

    public long countNumbers(File file) throws Exception {
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while ((line != null)) {
            if (line.isEmpty()) {
                line = reader.readLine();
                continue;
            }
            try {
                LongAnswer += Long.parseLong(line);
            } catch (NumberFormatException e) {
                line = reader.readLine();
                continue;
            }
            line = reader.readLine();
        }
        return LongAnswer;
    }

    public String concatWords(File file) throws Exception {
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while ((line != null)) {
            if (line.isEmpty()) {
                line = reader.readLine();
                continue;
            }
            try {
                Long.parseLong(line);
            } catch (NumberFormatException e) {
                lineAnswer.append(line + " ");
            }
            line = reader.readLine();

        }

        return lineAnswer.toString().trim();
    }

}
