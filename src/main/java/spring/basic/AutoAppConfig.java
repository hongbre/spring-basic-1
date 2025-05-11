package spring.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.basic.member.MemberRepository;
import spring.basic.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
        basePackages = "spring.basic",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //@Configuration 도 @Component 이기 때문에 Scan 대상에서 제외
public class AutoAppConfig {
/*
    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
*/
}
