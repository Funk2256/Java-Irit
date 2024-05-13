package laba10.Example4;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        //Открываем файл для чтения
        String filePath = "src/laba10/Example4/example.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        //Создаем экземпляр книги Excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //Получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        workbook.close();
        inputStream.close();
    }
}
