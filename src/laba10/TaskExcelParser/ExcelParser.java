package laba10.TaskExcelParser;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelParser {
    public static void main(String[] args) {
        //Открываем файл для чтения
        try {
            String filePath = "src/laba10/TaskExcelParser/example.xlsx";
            FileInputStream inputStream = new FileInputStream(filePath);

            //Создаем экземпляр книги Excel из файла
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            //Получаем лист из книги по его имени
            XSSFSheet sheet = workbook.getSheet("Товары");
            if (sheet == null) {
                throw new IllegalArgumentException("Лист с названием 'Товары' не найден в файле.");
            }
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
            workbook.close();
            inputStream.close();

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
            System.err.println("Пожалуйста, проверьте название листа в файле.");
        }
    }
}
