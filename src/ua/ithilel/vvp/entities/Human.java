package ua.ithilel.vvp.entities;

import java.util.Objects;

public class Human {
    private String surname;
    private String name;
    private String patronymic;

    @Override
    public String toString() {
        return
                surname + " " + name +" "+patronymic;
    }

    @Override
    public boolean equals(Object hum) {
        if (this == hum) return true;
        if (hum == null || getClass() != hum.getClass()) return false;
        Human human = (Human) hum;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic);
    }

    public Human(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
