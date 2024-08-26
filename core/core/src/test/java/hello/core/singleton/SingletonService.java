package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();

    // 조회할 때 사용
    // public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance(){
        return instance;
    }

    // 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService(){ // 다른 곳에서 생성하지 못하게 막음, 생성할 수 있는 곳은 아무곳도 없다
    }
}
