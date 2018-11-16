package com.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Audit {
    private String userId;
    private String action;

}
