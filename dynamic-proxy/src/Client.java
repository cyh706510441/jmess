import java.lang.reflect.Proxy;

/**
 * @author chenyh
 * @date 2020-02-15
 */
public class Client {

    public static void main(String[] args) {
        {
            SubjectProxy proxy = new SubjectProxy(new SubjectImpl());
            proxy.request();
            System.out.println("");
        }

        {
            RequestableProxy proxy = new RequestableProxy(new RequestableImpl());
            proxy.request("hello");
            System.out.println("");
        }

        {
            ISubject realSubject = new SubjectImpl();
            DynamicProxyHandler handler = new DynamicProxyHandler(realSubject);
            ISubject subject = (ISubject) Proxy.newProxyInstance(
                    handler.getClass().getClassLoader(),
                    realSubject.getClass().getInterfaces(),
                    handler
            );
            // com.sun.proxy.$Proxy0
            System.out.println(subject.getClass().getName());
            // 代理对象调用request时，会跳转到关联的handler的invoke方法
            subject.request();
            System.out.println("");
        }

        {
            DynamicProxyHandler handler = new DynamicProxyHandler(new RequestableImpl());
            IRequestable requestable = (IRequestable) Proxy.newProxyInstance(
                    handler.getClass().getClassLoader(),
                    new Class[] { IRequestable.class },
                    handler
            );
            // com.sun.proxy.$Proxy1
            System.out.println(requestable.getClass().getName());
            requestable.request("hello");
        }
    }
}
