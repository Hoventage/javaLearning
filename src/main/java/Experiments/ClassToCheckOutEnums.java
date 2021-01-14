package Experiments;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.net.nntp.NewGroupsOrNewsQuery;
import utils.logger.Logger.*;

public class ClassToCheckOutEnums {

    private static final Logger logger = Logger.getLogger(ClassToCheckOutEnums.class.getName());

    public static void main(String[] args) throws IOException {

       /* System.out.println(EnumWithStringsOmg.FIRST.getStr());
        System.out.println(EnumWithStringsOmg.SECOND.getStr());
        System.out.println(EnumWithStringsOmg.THIRD.getStr());*/

        //FileHandler fileHandler = new FileHandler("src/resources/logFile.txt", true);
        /*logger.addHandler(fileHandler);
        fileHandler.setFormatter(new SimpleFormatter());*/

        /*logger.info(MessageFormat.format("{0} Запись - результат работы метода info", logger.getName()));
        logger.log(Level.SEVERE, MessageFormat
                .format("{0} Запись - результат работы метода log", logger.getName()));*/

        /*utils.logger.Logger.info("info log");*/



        /*if (Arrays.asList(fileNames).contains("logFile.txt")) {

        }*/

        String directory = "D:/Java и унижения))/Программирование на Java/4.Стандартная библиотека";
        String filePath = "src/main/java/resources/sample.xml";

        ClassToCheckOutEnums.createNeededFile(directory, filePath);
    }

    public static void createNeededFile(String directory, String filePath) throws IOException {

        File finalDirectory = new File(directory);

        boolean creation = false;

        if (finalDirectory.exists()) {
            logger.log(Level.INFO, "Папка уже существует");
        } else {
            creation = finalDirectory.mkdir();
        }


        var dirFiles = finalDirectory.listFiles();
        String[] fileNames = new String[dirFiles.length];
        int i = 0;
        for (File file : dirFiles) {
            System.out.println(file.getName());
            fileNames[i] += file.getName();
            i++;
        }


        // путь к файлу в проекте
        Path fileLocation = Paths.get(filePath);
        // разделяю полный путь к файлу по "/"
        String[] parts = filePath.split("/");
        // получаю последний элемент массива (то есть имя будущего файла)
        String neededFileName = parts[parts.length - 1];
        // конверчу тушку файла в массив байт
        byte[] data = Files.readAllBytes(fileLocation);
        // готовлю болванку файла, говорю, куда его залить и указываю имя как у файла в проекте
        File logFile = new File(directory, neededFileName);
        // собственно создание файла (пустого)
        logFile.createNewFile();
        // а вот тут лютый пиздец как по мне :)
        Files.write(Paths.get(logFile.getAbsolutePath()), data);
    }
}
