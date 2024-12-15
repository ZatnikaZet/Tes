package com.zet.repository;

public class Person {
    private long id;
    private String name;
    private int age;
    private String livingCity;
    private String email;
    private String job;
    private Gender gender;
    private boolean isMarried;

    public Person(){}

    public Person (long id , String name, int age , String  livingCity, String email, String job, Gender gender, boolean isMarried){
        setId(id);
        setName(name);
        setAge(age);
        setLivingCity(livingCity);
        setEmail(email);
        setJob(job);
        setGender(gender);
        setMarried(isMarried);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLivingCity() {
        return livingCity;
    }

    public void setLivingCity(String livingCity) {
        this.livingCity = livingCity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
