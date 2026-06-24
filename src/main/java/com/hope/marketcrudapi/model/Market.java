
// This Entity maps the Java Class to the database markets table
package com.hope.marketcrudapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "markets")

public class Market {

    //@Id tells JPA that this field is the primary key
    @Id
    //Tells postGre to generate IDs automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id; //Long because database IDs are often Large numbers
    //Validation
        @NotBlank(message = "Market cannot be empty")
        private String name;

        //Default constructor required by JPA - Spring uses this constructor when creating objects from database rows.
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
