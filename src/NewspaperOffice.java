import java.util.ArrayList;

public class NewspaperOffice extends ISubject {

    private boolean IsDataChanged;

    public NewspaperOffice() {
        listObservers = new ArrayList<IObserver>();
        setIsDataChanged(false);
    }

    // 加入觀察者
    public void RegisterObserver(IObserver pObserver) {
        listObservers.add(pObserver);
    }

    // 移除觀察者
    public void RemoveObserver(IObserver pObserver) {
        if (listObservers.indexOf(pObserver) >= 0)
            listObservers.remove(pObserver);
    }

    // 發送通知給在監聽名單中的觀察者
    public void notifyObservers(String pContent) {
        for (int i = 0; i < listObservers.size(); i++) {
            listObservers.get(i).Update(pContent);
        }
        setIsDataChanged(false);
    }

    // 有新的資料更新
    public void sendLatestNews(String context) {
        System.out.printf("Sending " + context);
        setIsDataChanged(true);

        if (true == isIsDataChanged()) {
            notifyObservers(context);
        }
    }

    boolean isIsDataChanged() {
        return IsDataChanged;
    }

    void setIsDataChanged(boolean isDataChanged) {
        IsDataChanged = isDataChanged;
    }
}
