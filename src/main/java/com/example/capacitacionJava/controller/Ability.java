package com.example.capacitacionJava.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ability {
    private String name;
    private String type;
    private String status;
    private String date;
}
