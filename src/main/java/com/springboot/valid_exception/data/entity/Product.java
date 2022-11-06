package com.springboot.valid_exception.data.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


    /*
    * @Entity: 해당 클래스가 entity 임을 명시. 클래스 자체는 테이블과 일대일로 매칭되며 해당 클래스의 인스턴스는
    * 매핑되는 테이블에서 하나의 레코드를 의미함.
    *
    * @Table: 앤티티 클래스는 테이블과 매핑되므로 특별한 경우가 아니라면 @Table 어노테이션이 필요하지 않음.
    *
    * @Id: 앤티티 클래스의 필드는 테이블의 칼럼과 매핑됨. 본 어노테이션은 테이블의 기본값(primary key) 역할로 사용됨.
    *
    * @GeneratedValue: 일반적으로  @Id 와 함께 사용되며, 해당 필드의 값을 어떤 방식으로 자동으로 생성할 지 결정할 때 사용.
    *
    * @Column: 앤티티 클래스의 필드는 자동으로 테이블 칼럼으로 매핑됨. 그래서 별도의 설정을 하지 않을 시, 명시하지 않아도 됨.
    *
    * @Transient: 앤티티 클래스에 선언되어있지만, 데이터베이스에서는 필요 없을 경우 사용.
    *
    * */
}
