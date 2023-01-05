import com.example.hello.*;
import com.example.bye.*;

public class MainApplication{

    private HelloWorld helloWorld;
    private HelloJava helloJava;
    private ByeWorld byeWorld;
    private ByeJava byeJava;

    public MainApplication(){
        this.helloWorld = new HelloWorld();
        this.helloJava = new HelloJava();
        this.byeWorld = new ByeWorld();
        this.byeJava = new ByeJava();
     }

    public static void main(String args[]){
        MainApplication mainApplication = new MainApplication();
        mainApplication.helloWorld.sayHelloWorld();
        mainApplication.helloJava.sayHelloJava();
        mainApplication.byeJava.sayByeJava();
        mainApplication.byeWorld.sayByeWorld();
    }
}