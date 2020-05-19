package models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Syllabus {
    private StringProperty start = new SimpleStringProperty();
    private StringProperty finish = new SimpleStringProperty();

    public Syllabus(String start, String finish){};

    public String getStart() {
        return start.get();
    }

    public StringProperty startProperty() {
        return start;
    }

    public void setStart(String start) {
        this.start.set(start);
    }

    public String getFinish() {
        return finish.get();
    }

    public StringProperty finishProperty() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish.set(finish);
    }
}
