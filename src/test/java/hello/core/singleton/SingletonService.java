package hello.core.singleton;

public class SingletonService {

    //애플리케이션 실행시점에 객체를 한개 생성하고 가지고있는다
    private static final SingletonService instance = new SingletonService();

    //객체를 사용할 때 처음 만든 객체1개를 갖고온다.
    public static SingletonService getInstance(){
        return instance;
    }

    //private 으로 생성자를 지정하면 외부에서 새로운 객체를 만들 수 없다.
    private SingletonService(){}

    public void login(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
