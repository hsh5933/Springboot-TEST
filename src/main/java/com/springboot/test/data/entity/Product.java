package com.springboot.test.data.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "name") //숨겨야할 정보가있다면 제외가능
@Table(name = "product")
//테이블어노테이션 클래스의 이름과 테이블의 이름을 다르게 지정해야하는경우사용
//명시하지않으면 이름이 동일하다는 의미.
public class Product {

    @Id //테이블의 기본값으로 사용됨. 엔티티에 필수로들어가야함.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false) //컬럼값에 null처리가 가능한지 명시
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
