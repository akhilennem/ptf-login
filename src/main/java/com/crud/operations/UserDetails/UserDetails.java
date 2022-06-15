package com.crud.operations.UserDetails;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="user_details")
public class UserDetails {


//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public int sl_no;
public String designation;

    @NotBlank
    @Size(max=50)
public String name;
    @NotBlank
    @Size(max=70)
public String address;
    @NotBlank
    @Size(max=15)
public String ph;
    @Id
    @Size(max = 75)
    public String email;
    }



