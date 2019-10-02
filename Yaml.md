<h4> Yaml

# build.gradle 
<pre>
    dependencies {
        annotationProcessor "org.springframework.boot:spring-boot-configuration-processor"
    }
</pre>

*[reference](https://docs.spring.io/spring-boot/docs/2.1.8.RELEASE/reference/html/configuration-metadata.html#configuration-metadata-annotation-processor)*

# /src/main/resources/application.yml 생성
<pre>
    env:
      servers:
        - dev.example.com
        - prod.example.com
    sample:
      data:
        id: "whybwhy"
        age: 39
        
    spring:
      profiles:
        active: live
    ---
    spring:
      profiles: local
      datasource:
        name: whybwhy-dev
      jpa:
        generate-ddl: true
    ---
    spring:
      profiles: live
      datasource:
        name: whybwhy-live
        jpa:
          generate-ddl: true
</pre>

# Springboot
* 방법 1 @Value
<pre>
@Component
@Getter
public class YamlConfig {
    @Value("${sample.data.id}") private String id;
    @Value("${sample.data.age}") private String age;
    @Value("${spring.profiles}") private String profile;
    @Value("${spring.datasource.name}") private String datasourceName;
}
// @SpringBootApplication 에서 resources 를 자동으로 로딩하는 듯하다.
// @Setter가 없어도 가능 @Value에서 Setter의 가능을 하는 듯 하다.
</pre>
  

* 방법 2 @ConfigurationProperties
<pre>
@Component
@ConfigurationProperties(prefix = "env")
@Getter
@Setter
public class YamlConfig {
    private List<String> servers;
}
</pre>

* 방법 3
    두 방법을 혼합하여 사용 가능
    
[reference](https://jeong-pro.tistory.com/159)<br/>
[reference](https://effectivesquid.tistory.com/m/36)

# 실행
<pre>
    // 터미널 (application.yml 보다 우선순위가 높다)
    java -jar -Dspring.profiles.active=[리전설정] spring-gradle-demo-0.0.1-SNAPSHOT.war
    
    // application.yml
    spring:
          profiles:
            active: live
            
    // junit 설정 (성공 버전 다른 버전은 모두 실패)
    @RunWith(SpringRunner.class)
    @SpringBootTest
    @TestPropertySource("classpath:application.yml")
    @ActiveProfiles("live")
    @AutoConfigureMockMvc
</pre>

# Junit 실행

Gradle Build 실패로 dependencies 추가
<pre>
dependencies {
    annotationProcessor('org.projectlombok:lombok')
    compileOnly('org.projectlombok:lombok')
    testAnnotationProcessor('org.projectlombok:lombok')
    testCompileOnly('org.projectlombok:lombok')
}
</pre>

* JUnit 에서 yaml 파일 로드 실패
<pre>
//@SpringBootTest(properties = {"classpath:application.yml"} )
//@WebMvcTest(controllers = {YamlController.class}, properties = {"classpath:application.yml"})
</pre>
[reference](http://blog.naver.com/PostView.nhn?blogId=kkforgg&logNo=221261060159&parentCategoryNo=&categoryNo=&viewDate=&isShowPopularPosts=false&from=postView)

# Properties + Intellij plugin
[intellij-Assistant](https://cheese10yun.github.io/intellij-Assistant/)




