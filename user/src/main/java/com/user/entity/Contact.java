package com.user.entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    private int cId;
    private String email;
    private String contactName;
    private int userId;


}
