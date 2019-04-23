package com.chenm.demo.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@ConfigurationProperties(prefix="person")
@Component
public class Person {
    @Value("${person.name}")
    String name;
    int age;
    int sex;
}
