package com.zet.repository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //objek
        Person person1 = new Person(1, "Zatnika Maulana", 12 , "Konsel", " Email", " Mahasiswa ", Gender.FEMALE, false);
        Person person2 = new Person(2, "Eki pratama", 12 , "Konsel", " Email", " Mahasiswa ", Gender.FEMALE, false);
        Person person3 = new Person(3, "Indah Ciput", 15 , "Konsel", " Email", " Mahasiswa ", Gender.FEMALE, false);

        //variabel
        PersonRepository repository = new PersonRepository();

        repository.add(person1);
        repository.add(person2);
        repository.add(person3);

        //membuat varibele dan asign value using interface

        List<Person> personList = repository.getAll();
        //printt
        System.out.println("====================Data Pertama Yang dimasukan==============");
        print(personList);
        System.out.println();

        System.out.println("=====================Data yang telah Diupdate=============================================");
        Person person3Update = new Person(3, "Putri ningsih", 15 , "Kolaka", " Email", " Mahasiswa ", Gender.FEMALE, false);

        repository.update(person3, person3Update);

        //print hasilnya
        personList = repository.getAll();
        print(personList);
        System.out.println();

        System.out.println("============Hasil Pencarian Data dengan id= 2=================");
        var personListByid = repository.findBySpecification(new FindByPersonId(2));
        print (personListByid);
        System.out.println();


        System.out.println("=============hasil pencarian Data dengan Nama : Zatnika maulana==========");
        var personlistByNama = repository.findBySpecification(new FindByPersonName("Zatnika Maulana"));
        print(personlistByNama);
        System.out.println();

        // menghapus
        repository.remove(3);
        System.out.println("======================data yang dihapus id 3====================");
        personList = repository.getAll();
        print(personList);
    }
    public static void  print (List<Person> personList){
        for(Person eachPerson : personList){
            System.out.println(String.format("id: %s, name: %s, age: %s, livingCity: %s, email: %s, job: %s, Gender: %s , Married: %s ",eachPerson.getId(), eachPerson.getName(), eachPerson.getAge(), eachPerson.getLivingCity(), eachPerson.getEmail(), eachPerson.getJob(), eachPerson.getGender(), eachPerson.isMarried()));

        }

    }
}
