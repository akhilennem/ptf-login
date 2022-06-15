package com.crud.operations;



import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "users")
public class User {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int sl;

    private String name;
    public String attendance;
    public int confirmation_code;
    private LocalDate date=LocalDate.now();
    private LocalTime time=LocalTime.now();
    public String email;

    public User() {
    }

    public int getId() {
        return sl;
    }

    public void setId(int id) {
        this.sl = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public int getConfirmation_code() {
        return confirmation_code;
    }

    public void setConfirmation_code(int confirmation_code) {
        this.confirmation_code = confirmation_code;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
