package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Direction;
import models.Klas;
import models.Syllabus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Klas k = new Klas(Date date, String letter, Direction direction, Syllabus syllabus);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date d = formatter.parse("01.09.2016");
            k.setDate(d);
            k.getEduYear();
        }
        catch(ParseException e){

        }
        launch(args);
    }
    public static void main(String[] args){
        ArrayList<String> topics = new ArrayList<String>();
        topics.add("функции");
    }
}
