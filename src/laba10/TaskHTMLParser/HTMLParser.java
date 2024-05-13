package laba10.TaskHTMLParser;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTMLParser {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://itlearn.ru/first-steps";
        FileWriter fw = new FileWriter("src/laba10/TaskHTMLParser/links.txt");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)).build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 200) {
            try {
                Document doc = Jsoup.connect(url).get();
                Elements links = doc.select("a[href]");
                System.out.println("Ответ сервера: " + response.statusCode());
                for (Element link : links) {
                    System.out.println(link.attr("abs:href"));
                    //Сохранение данных в файл
                    fw.append(link.attr("abs:href"));
                    fw.append("\n");
                }
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        } else System.out.println("Ответ сервера: " + response.statusCode() + " код ошибки.");

    }
}