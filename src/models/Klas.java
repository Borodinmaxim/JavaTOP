package models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.joda.time.*;

import java.util.Calendar;
import java.util.Date;

public class Klas {
    private ObjectProperty<Date> date = new SimpleObjectProperty<>(new Date());
    private StringProperty letter = new SimpleStringProperty();
    private StringProperty name = new SimpleStringProperty();
    private ObjectProperty<Direction> direction;
    private ObjectProperty<Syllabus> syllabus;

    public Klas (Date date, String letter, Direction direction, Syllabus syllabus){
        this.date.set(date);
        this.letter.set(letter);
        this.direction.set(direction);
        this.syllabus.set(syllabus);
        this.name.set(getEduYear() + letter);
    }

    public Date getDate() {
        return date.get();
    }

    public ObjectProperty<Date> dateProperty() {
        return date;
    }

    public void setDate(Date date)
    {
        this.date.set(date);
        this.name.set(getEduYear() + letter);
    }

    public String getLetter() {
        return letter.get();
    }

    public StringProperty letterProperty() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter.set(letter);
        this.name.set(getEduYear() + letter);
    }

    public Direction getDirection() {
        return direction.get();
    }

    public ObjectProperty<Direction> getDirectionProperty() {return direction;}

    public void setDirection(Direction direction) {
        this.direction.set(direction);
    }

    public Syllabus getSyllabus() {
        return syllabus.get();
    }

    public ObjectProperty<Syllabus> getSyllabusProperty(){return syllabus;}

    public void setSyllabus(Syllabus syllabus) {
        this.syllabus.set(syllabus);
    }

    public String getEduYear() {
        Date today = Calendar.getInstance().getTime();
        Interval interval = new Interval(this.date.get().getTime(), today.getTime());
        Period p = interval.toPeriod();
        int year = p.getYears();
        return String.valueOf(year + 1);
    }
}
