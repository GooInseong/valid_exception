package com.springboot.valid_exception.data.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private String name;
    private Integer price;
    private Integer stock;
}
