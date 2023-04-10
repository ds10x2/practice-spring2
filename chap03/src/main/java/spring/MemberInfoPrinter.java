package spring;

public class MemberInfoPrinter {
    private MemberDao memDao;
    private MemberPrinter printer;

    public void printMemberInfo(String email){
        Member member = memDao.selectByEmail(email);
        if(member == null){
            System.out.println("데이터 없음\n");
            return;
        }
        printer.print(member);
        System.out.println();
    }
    public void setMemberDao(MemberDao memberDao){//의존 주입 setter 메서드
        this.memDao = memberDao;
    }
    public void setPrinter(MemberPrinter printer){//의존 주입 setter 메서드
        this.printer = printer;
    }
}
