
public interface IObserver {

    void Update(String pMessage);

    // 訂閱報紙
    public void SubscribeNewspaper(ISubject news);

    // 取消訂閱報紙
    public void UnsubscribeNewspaper(ISubject news);
}
