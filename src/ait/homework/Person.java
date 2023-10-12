package ait.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
Создайте класс Person, c полями имя(стринг) и дата рождения(Date), которому при создании передавайте имя
и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".

Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".
 */

public class Person implements Comparable<Person> {
        private String name;
        private Date birthDate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Person(String name, String birthDate) throws ParseException { // исправили в Constructor параметр с Date на String
        this.name = name;
        SimpleDateFormat formatter  = new SimpleDateFormat("dd.MM.yyyy");
        this.birthDate = formatter.parse(birthDate);
    }

    @Override
    public int compareTo(Person o) {
        return o.birthDate.compareTo(this.birthDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter  = new SimpleDateFormat("dd.MM.yyyy"); // добавили эту строку в toString
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + formatter.format(birthDate) +  // прописали формат для даты сразу, т.е. изменили шаблон toString
                '}';
    }
}


