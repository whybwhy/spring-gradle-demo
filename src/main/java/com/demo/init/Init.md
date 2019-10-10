# Spring Bean LifeCycle

 - Spring Bean LifeCycle을 반드시 이해해야 한다. 
 - LifeCycle 에 개발자가 관여하는 방법은 세가지가 제공된다.
   - 각 방법을 섞어쓰는 것은 순서가 보장되지 않으므로 좋지 않다고 판단된다.<br/> 
     가령 XML, @Annotation, implements 모두 사용하지 않고 상황에 따라 한가지 방법을 선택한다.
   - Init과 Destory를 한 구간에서 구현하는 방법과 따로 구현하는 방법이 있으나 선택의 문제라고 판단한다.
   - 여러 구간(파일)에 분산되어 선언하는 방법과 한 구간(파일)에 선언하는 방법이 있으나 여러 구간으로 분산할 경우 우선순위(@Order)를 보장하지 못한다.
   - 우선순위 문제와 유지보수를 수월하게 하기 위해 한 구간에서 관리하는 것이 좋다고 본다.

# @PostConstruct & @Destory
 - https://github.com/whybwhy/spring-gradle-demo/blob/master/src/main/java/com/demo/init/PostConstructService1.java
# implements InitializingBean & DisposableBean
 - https://github.com/whybwhy/spring-gradle-demo/blob/master/src/main/java/com/demo/init/InitAndDestoryService.java