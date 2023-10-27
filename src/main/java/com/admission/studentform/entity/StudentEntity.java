package com.admission.studentform.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity

@Table(name = "a_student")

public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")

    private Long id;

   @Column(name = "name")
    private String name;

   @Column(name = "gender")
    private String gender;

   @Column(name = "dob")
    private Date dob;

   @Column(name = "Age")
    private String age;

   @Column(name = "Father name")
   private  String f_name;

   @Column(name = "Email")
   private String email;

   @Column(name = "Address")
   private String address;

   @Column(name = "Phone No")
   private Number phone_no;

    public StudentEntity() {
    }


    public StudentEntity(Long id, String name, String gender, Date dob ,String age,String f_name,String address,Number phone_no) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
        this.f_name = f_name;
        this.address=address;
        this.phone_no = phone_no;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Number getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(Number phone_no) {
        this.phone_no = phone_no;
    }

}
