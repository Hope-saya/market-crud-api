
// This Entity maps the Java Class to the database markets table
package com.hope.marketcrudapi.model;

import jakarta.persistence.*;



@Entity
@Table(name = "markets")

public class Market {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id;
        private String name;

        //Default constructor required by JPA
    public Market(){

    }
    //The constructor
    public Market(String name){
        this.name = name;
    }

    //The Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


//    @Override
//    public String toString() {
//        return "Market{" +
//                "id" + Id +
//                "name" + name + "}" ;
//    }
}
