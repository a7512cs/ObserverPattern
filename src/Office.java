
public class Office {

    public static void main(String[] args) {
        // 產生一間報社
        NewspaperOffice News = new NewspaperOffice();

        // Arvin 想要訂閱報紙
        Customer arvin = new Customer("Arvin");
        arvin.SubscribeNewspaper(News);

        // Jack 想要訂閱報紙
        Customer jack = new Customer("Jack");
        jack.SubscribeNewspaper(News);

        // Marshall 想要訂閱報紙
        Customer Marshall = new Customer("Marshall");
        Marshall.SubscribeNewspaper(News);
        //效果一樣 都可使用 但通常會包成函式 因為要做的事情不會只有Register
        //News.RegisterObserver(Marshall);


        // 報社發送了第一則新聞
        News.sendLatestNews("News One!!!!!\n");

        // Arvin 不想看報紙了，要退訂
        arvin.UnsubscribeNewspaper(News);

        // 報社發送了第二則新聞
        News.sendLatestNews("News Two!!!!!\n");
    }

}
