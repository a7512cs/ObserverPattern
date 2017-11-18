
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
        
        //�p�G����ISubject news���ƭȦs�U�Ӯ�
        //�]�i�H��U���ƭȦs�J��class���ܼƤ� ex:pMessage
        System.out.printf("   %s receive a new message: %s", getMyName(), pMessage);
    }

    // �q�\����
    public void SubscribeNewspaper(ISubject news) {
        
        //�]�i��ISubject news������x�s�_��
        news.RegisterObserver(this);
        //�N���U�̶פJ��Ʈw...
        //�o�e�s�Τ���U�T��....
    }

    // �����q�\����
    public void UnsubscribeNewspaper(ISubject news) {
        news.RemoveObserver(this);
    }
}
