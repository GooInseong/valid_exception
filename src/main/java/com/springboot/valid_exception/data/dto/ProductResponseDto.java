package com.springboot.valid_exception.data.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ProductResponseDto {

    private Long number;
    private String name;
    private Integer price;
    private Integer stock;
}
