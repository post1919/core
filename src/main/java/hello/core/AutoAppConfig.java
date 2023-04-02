package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //basePackages를 지정하지 않으면 @ComponentScan을 지정한 위치 기준 하위로 스캔함
        basePackages = "hello.core"
        , excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION, classes=Configuration.class
        )
)
public class AutoAppConfig {

}
