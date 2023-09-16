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
    String name;
    String tipo;
}
