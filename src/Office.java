
public class Office {

    public static void main(String[] args) {
        // ���ͤ@������
        NewspaperOffice News = new NewspaperOffice();

        // Arvin �Q�n�q�\����
        Customer arvin = new Customer("Arvin");
        arvin.SubscribeNewspaper(News);

        // Jack �Q�n�q�\����
        Customer jack = new Customer("Jack");
        jack.SubscribeNewspaper(News);

        // Marshall �Q�n�q�\����
        Customer Marshall = new Customer("Marshall");
        Marshall.SubscribeNewspaper(News);
        //�ĪG�@�� ���i�ϥ� ���q�`�|�]���禡 �]���n�����Ʊ����|�u��Register
        //News.RegisterObserver(Marshall);


        // �����o�e�F�Ĥ@�h�s�D
        News.sendLatestNews("News One!!!!!\n");

        // Arvin ���Q�ݳ��ȤF�A�n�h�q
        arvin.UnsubscribeNewspaper(News);

        // �����o�e�F�ĤG�h�s�D
        News.sendLatestNews("News Two!!!!!\n");
    }

}
