package com.demo.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("qualifierBean1")
public class QualifierBean1 implements QualifierBeanAble {
}
