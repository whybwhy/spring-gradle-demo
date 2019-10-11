package com.demo.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("qualifierBean0")
public class QualifierBean0 implements QualifierBeanAble {
}
