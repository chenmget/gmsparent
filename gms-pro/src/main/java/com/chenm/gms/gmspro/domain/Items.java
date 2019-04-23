package com.chenm.gms.gmspro.domain;

import lombok.*;

import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Items {
    @Id
    private String id;
    private String name;
    private Integer num;
}
