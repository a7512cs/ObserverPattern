import java.util.ArrayList;

public class NewspaperOffice extends ISubject {

    private boolean IsDataChanged;

    public NewspaperOffice() {
        listObservers = new ArrayList<IObserver>();
        setIsDataChanged(false);
    }

    // �[�J�[���
    public void RegisterObserver(IObserver pObserver) {
        listObservers.add(pObserver);
    }

    // �����[���
    public void RemoveObserver(IObserver pObserver) {
        if (listObservers.indexOf(pObserver) >= 0)
            listObservers.remove(pObserver);
    }

    // �o�e�q�����b��ť�W�椤���[���
    public void notifyObservers(String pContent) {
        for (int i = 0; i < listObservers.size(); i++) {
            listObservers.get(i).Update(pContent);
        }
        setIsDataChanged(false);
    }

    // ���s����Ƨ�s
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
