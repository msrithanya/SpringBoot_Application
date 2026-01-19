package com.example.first.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    Long RollNo;
   @NotNull
    String Name;
    String department;
    Long phoneNo;

}
