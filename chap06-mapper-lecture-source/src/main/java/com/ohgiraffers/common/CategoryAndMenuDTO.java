package com.ohgiraffers.common;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CategoryAndMenuDTO {

    private int code;
    private String name;
    private int refCategoryCode;

    private List<MenuDTO> menuList;
}
