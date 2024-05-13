package laba10.TaskXMLParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskXMLParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            File xmlFile = new File("/home/funk2256/my_scripts/Java-Irit/src/laba10/Task2/XMLDatabase.xml");
            File xslFile = new File("/home/funk2256/my_scripts/Java-Irit/src/laba10/Task2/XMLDatabase.xsl");

            Document doc = readXml(xmlFile);
            assert doc != null;
            Element rootElement = doc.getDocumentElement();

            boolean start = true;
            int choice;
            while (start) {
                System.out.println("""
                *-*-*--*-*-*-*-*-*-*-*-*-*-*-
                Выберите действие:
                1 - Добавить фильм;
                2 - Поиск по жанру или году издания;
                3 - Удалить фильм;
                4 - Вывести все фильмы в базе на экран;
                0 - Выход.
                *-*-*--*-*-*-*-*-*-*-*-*-*-*-
                """);
                System.out.print("Ваш выбор: ");
                choice = in.nextInt();
                in.nextLine();
                System.out.println();

                switch (choice) {
                    case 0:
                        System.out.println("Выход");
                        start = false;
                        break;
                    case 1:
                        addNewMovie(doc, rootElement);
                        updateXMLFile(doc, xmlFile, xslFile);
                        break;
                    case 2:
                        System.out.print("Введите критерий поиска: ");
                        search(doc, in.nextLine());
                        break;
                    case 3:
                        System.out.print("Введите название фильма для удаления: ");
                        removeMovie(doc, in.nextLine());
                        updateXMLFile(doc, xmlFile, xslFile);
                        break;
                    case 4:
                        display(doc);
                        break;
                    default:
                        System.out.println("Неверный код команды.\n");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }

    private static void addNewMovie(Document doc, Element rootElement) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название нового фильма: ");
        String title = in. nextLine();
        System.out.println("Введите страну: ");
        String country = in.nextLine();
        System.out.println("Введите год издания фильма: ");
        String year = in.nextLine();
        System.out.println("Введите жанр фильма: ");
        String genre = in.nextLine();
        System.out.println("Введите продолжительность в минутах: ");
        String time = in.nextLine();

        Element newMovie = doc.createElement("movie");

        Element newTitle = doc.createElement("title");
        newTitle.appendChild(doc.createTextNode(title));
        newMovie.appendChild(newTitle);

        Element newCountry = doc.createElement("country");
        newCountry.appendChild(doc.createTextNode(country));
        newMovie.appendChild(newCountry);

        Element newYear = doc.createElement("year");
        newYear.appendChild(doc.createTextNode(year));
        newMovie.appendChild(newYear);

        Element newGenre = doc.createElement("genre");
        newGenre.appendChild(doc.createTextNode(genre));
        newMovie.appendChild(newGenre);

        Element newTime = doc.createElement("time");
        newTime.appendChild(doc.createTextNode(time));
        newMovie.appendChild(newTime);

        rootElement.appendChild(newMovie);
    }

    private static void search(Document doc, String pattern) {
        NodeList nodeList = doc.getElementsByTagName("movie");
        List<Element> movies = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String genre = element.getElementsByTagName("genre").item(0).getTextContent();
                String year = element.getElementsByTagName("year").item(0).getTextContent();
                if (genre.equalsIgnoreCase(pattern) || year.equals(pattern)) {
                    movies.add(element);
                }
            }
        }

        if (movies.isEmpty()) {
            System.out.println("\nФильмы с такой страной или годом издания не найдены.");
        } else {
            System.out.println("\nНайденные фильмы:");
            for (Element movie : movies) {
                System.out.println("\tНазвание фильма: " + movie.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("\tСтрана: " + movie.getElementsByTagName("country").item(0).getTextContent());
                System.out.println("\tГод издания: " + movie.getElementsByTagName("year").item(0).getTextContent());
                System.out.println("\tЖанр: " + movie.getElementsByTagName("genre").item(0).getTextContent());
                System.out.println("\tПродолжительность: " + movie.getElementsByTagName("time").item(0).getTextContent());
                System.out.println();
            }
        }
    }

    private static void removeMovie(Document doc, String pattern) {
        NodeList nodeList = doc.getElementsByTagName("movie");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String movieTitle = element.getElementsByTagName("title").item(0).getTextContent();
                if (movieTitle.equalsIgnoreCase(pattern)) {
                    node.getParentNode().removeChild(node);
                    System.out.println("Фильм успешно удалён.");
                    break;
                }
            }
        }
    }

    private static Document readXml(File xmlFile) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void updateXMLFile(Document doc, File xmlFile, File xslFile) {
        try {
            StringBuilder content = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(xslFile));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer(new StreamSource(new StringReader(content.toString())));
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);

            System.out.println("XML-файл успешно обновлен!");
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void display(Document doc) {
        System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
        NodeList nodeList = doc.getElementsByTagName("movie");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("\n\tТекущий элемент: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("\t\tНазвание фильма: " + element.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("\t\tСтрана: " + element.getElementsByTagName("country").item(0).getTextContent());
                System.out.println("\t\tГод издания: " + element.getElementsByTagName("year").item(0).getTextContent());
                System.out.println("\t\tЖанр: " + element.getElementsByTagName("genre").item(0).getTextContent());
                System.out.println("\t\tПродолжительность: " + element.getElementsByTagName("time").item(0).getTextContent());
            }
        }
    }
}