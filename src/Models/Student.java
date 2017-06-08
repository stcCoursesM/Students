package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created on 08/06/2017.
 */
public class Student {

    public Student(String name, String surname, Date dateOfBirth, Long groupID, List<Contact> contacts) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.groupID = groupID;
        this.contacts = new ArrayList<>();
        this.studentId = (System.currentTimeMillis()+ (int)(Math.random()*100));
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Student)) return false;
        if (this.studentId != ((Student)obj).getId()) return false;
        return true;
    }


    @Override
    public int hashCode() {
        return (int) (21+studentId*42);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return studentId;
    }

    public void setId(Long id) {
        this.studentId = id;
    }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }




    private String name;
    private String surname;
    private String email;
    private Date dateOfBirth;
    private Long studentId;
    private Long groupID;
    private List<Contact> contacts;

}
