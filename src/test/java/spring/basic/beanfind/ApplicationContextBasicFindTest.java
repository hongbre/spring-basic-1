package spring.basic.beanfind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.basic.AppConfig;
import spring.basic.member.MemberService;
import spring.basic.member.MemberServiceImpl;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationContextBasicFindTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("Bean 이름으로 조회")
    void findBeanByName() {
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
        //System.out.println("memberService = " + memberService);
        //System.out.println("memberService.getClass() = " + memberService.getClass());
    }

    @Test
    @DisplayName("Bean 이름 없이 Type으로만 조회")
    void findBeanByType() {
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("구체 Type으로 조회")
    void findBeanByName2() {
        MemberService memberService = ac.getBean(MemberServiceImpl.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("Bean 이름으로 조회 실패")
    void findBeanByNameFailed() {
        //ac.getBean("hello", MemberService.class);
        assertThrows(NoSuchBeanDefinitionException.class, () -> ac.getBean("hello", MemberService.class));
    }
}
