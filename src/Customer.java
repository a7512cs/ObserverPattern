
public class Customer implements IObserver {

    public String MyName;

    private String getMyName() {
        return MyName;
    }

    private void setMyName(String str) {
        MyName = str;
    }

    public Customer(String pName) {
        setMyName(pName);
    }

    // ��s�̷s����
    public void Update(String pMessage) {
        System.out.printf("   %s receive a new message: %s", getMyName(), pMessage);
    }

    // �q�\����
    public void SubscribeNewspaper(ISubject news) {
        news.RegisterObserver(this);
        //�N���U�̶פJ��Ʈw...
        //�o�e�s�Τ���U�T��....
    }

    // �����q�\����
    public void UnsubscribeNewspaper(ISubject news) {
        news.RemoveObserver(this);
    }
}