package models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Human {
    private StringProperty first_name = new SimpleStringProperty();
    private StringProperty second_name = new SimpleStringProperty();
    private StringProperty patronymic = new SimpleStringProperty();

    public Human(String first_name, String second_name, String patronymic){};

    public String getFirst_name() {
        return first_name.get();
    }

    public StringProperty first_nameProperty() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name.set(first_name);
    }

    public String getSecond_name() {
        return second_name.get();
    }

    public StringProperty second_nameProperty() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name.set(second_name);
    }

    public String getPatronymic() {
        return patronymic.get();
    }

    public StringProperty patronymicProperty() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic.set(patronymic);
    }
}
