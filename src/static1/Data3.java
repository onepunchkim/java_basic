package static1;

public class Data3 {
    public String name;
    public static int count; //static 변수는 메서드 영역

    public Data3(String name){
        this.name = name;
        count++;
    }
}
