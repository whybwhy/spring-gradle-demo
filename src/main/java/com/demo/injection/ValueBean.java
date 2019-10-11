package com.demo.injection;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Value에 하드 코딩 하는 것보다 resource를 활용하는 것이 좋다고 판단된다.
 * 빌드도 부담이 되고 다국어 처리에도 불리하기 때문이다.
 */
@Component
@Getter
public class ValueBean {
    @Value("한글테스트-이런 곳에 하드코딩 하면 안되는데")
    private String stringValue;

    @Value("100")
    private int intValue;
}
