package com.choi.model.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String password;
    private String name;

}
