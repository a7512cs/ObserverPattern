
public interface IObserver {

    void Update(String pMessage);

    // �q�\����
    public void SubscribeNewspaper(ISubject news);

    // �����q�\����
    public void UnsubscribeNewspaper(ISubject news);
}
