package chap02;

public class Greeter {
    //Greeter 클래스를 사용하는 코드는 Greeter 객체를 생성하고 setFormat() 메서드를 이용해서 문자열 포맷을 지정,
    //greet() 메서드를 이용해서 메시지를 생성
    private String format;

    public String greet(String guest){ //문자열 포맷을 이용해 새로운 문자열 생성
        return String.format(format, guest);
    }
    public void setFormat(String format){
        this.format = format;
    }
}
