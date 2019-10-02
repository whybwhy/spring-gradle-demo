package com.demo.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString(exclude = {"strValue4"})
public class SampleVO {
    private String strValue1;
    private String strValue2;
    private String strValue3;
    private String strValue4;
    private String strValue5;
}
