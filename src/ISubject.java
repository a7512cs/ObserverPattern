import java.util.List;

public abstract class ISubject {

    // �ϥ�List�Ӧs���[��̦W��
    List<IObserver> listObservers;

    void RegisterObserver(IObserver pObserver) {
    }
    
    void RemoveObserver(IObserver pObserver) {
    }

    void notifyObservers(String pContent) {
    }
}
