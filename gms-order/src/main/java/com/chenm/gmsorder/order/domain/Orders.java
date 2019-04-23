package com.chenm.gmsorder.order.domain;

import lombok.*;

import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Orders {
    @Id
    private String id;
    private String orderNum;
    private String itemId;
}
