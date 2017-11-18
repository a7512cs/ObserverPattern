import java.util.List;

public abstract class ISubject {

    // 使用List來存放觀察者名單
    List<IObserver> listObservers;

    void RegisterObserver(IObserver pObserver) {
    }
    
    void RemoveObserver(IObserver pObserver) {
    }

    void notifyObservers(String pContent) {
    }
}
