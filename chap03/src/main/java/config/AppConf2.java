package config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.*;

@Configuration
public class AppConf2 {
    @Autowired //자동 주입을 위한 것, 해당 타입의 빈을 찾아서 필드에 할당함
    //스프링 빈에 의존하는 다른 빈을 자동으로 주입하고 싶을 때 사용
    private MemberDao memberDao;
    @Autowired
    private MemberPrinter memberPrinter;

    @Bean
    public MemberRegisterService memberRegSvc(){
        return new MemberRegisterService(memberDao);
    }
    @Bean
    public ChangePasswordService changePwdSvc(){
        ChangePasswordService pwdSvc= new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
        return pwdSvc;
    }
    @Bean
    public MemberListPrinter listPrinter(){
        return new MemberListPrinter(memberDao, memberPrinter);
    }
    @Bean
    public MemberInfoPrinter infoPrinter(){
        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
        infoPrinter.setMemberDao(memberDao);
        infoPrinter.setPrinter(memberPrinter);
        return infoPrinter;
    }

    @Bean
    public VersionPrinter versionPrinter(){
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }
}
