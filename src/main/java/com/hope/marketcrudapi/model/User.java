package com.hope.marketcrudapi.model;

import com.hope.shared.models.BaseModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="users")
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class User extends BaseModel {

    @Getter
    private String name;
    @Getter
    private String email;
    private String password;

}
