package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.MemberDao;
import spring.MemberPrinter;

@Configuration
//@Import(AppConf2.class)
//@Import 애노테이션으로 지정한 AppConf2 설정 클래스도 함꼐 사용하기 때문에 스프링 컨테이너를 생성할 때
// AppConf2 설정 클래스를 지정할 필요가 없음
public class AppConf1 {
    @Bean
    public MemberDao memberDao(){
        return new MemberDao();
    }

    @Bean
    public MemberPrinter memberPrinter(){
        return new MemberPrinter();
    }
}
