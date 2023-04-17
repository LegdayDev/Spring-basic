package hello.core.autowired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class AutoWiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{
        //Member 클래스는 스프링 빈이 아니다

        @Autowired(required = false) //디폴트값은 true , false 옵션은 이 메서드는 호출이 안댐
        public void setNoBean1(Member noBean1){
            System.out.println("noBean1 = " + noBean1);
        }
        @Autowired //@Nullable 호출은 되지만 null로 들어온다
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("noBean1 = " + noBean2);
        }
        @Autowired //자바8에서 제공하는 문법이고, Optional.empty 값을 넣어준다.
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("noBean1 = " + noBean3);
        }

    }

}
