import com.classes.ICall;
import com.classes.IPhone;
import com.classes.ITunes;
import com.classes.Safari;

public class App {
    public static void main(String[] args) throws Exception {
        ICall iCall = new ICall();
        ITunes iTunes = new ITunes();
        Safari safari = new Safari();

        IPhone iphone = new IPhone(iTunes, safari, iCall);

        iphone.getICall().atender();
        iphone.getITunes().tocar();
        iphone.getSafari().exibirPagina("www.google.com");
    }
}
