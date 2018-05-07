public class Client {
    public static void main(String[] args){
    //创建需要被适配的对象
    Adatee adaptee = new Adatee();
    //创建客户端需要调用的接口对象
    Target target = new Adapter(adaptee);
    //请求处理
    target.request();
    }
   }