package models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Subject {
    private StringProperty item_name = new SimpleStringProperty();
    private ObjectProperty<Teacher> teacher;

    public String getItem_name() {
        return item_name.get();
    }

    public StringProperty item_nameProperty() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name.set(item_name);
    }

    public Teacher getTeacher() {
        return teacher.get();
    }

    public ObjectProperty<Teacher> teacherProperty() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher.set(teacher);
    }
}
