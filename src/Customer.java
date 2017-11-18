
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

    // 更新最新消息
    public void Update(String pMessage) {
        
        //如果有把ISubject news的數值存下來時
        //也可以把各項數值存入此class的變數中 ex:pMessage
        System.out.printf("   %s receive a new message: %s", getMyName(), pMessage);
    }

    // 訂閱報紙
    public void SubscribeNewspaper(ISubject news) {
        
        //也可把ISubject news的資料儲存起來
        news.RegisterObserver(this);
        //將註冊者匯入資料庫...
        //發送新用戶註冊訊息....
    }

    // 取消訂閱報紙
    public void UnsubscribeNewspaper(ISubject news) {
        news.RemoveObserver(this);
    }
}
