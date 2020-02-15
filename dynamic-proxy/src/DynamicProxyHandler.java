import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author chenyh
 * @date 2020-02-15
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object target;

    public DynamicProxyHandler(Object target) {
        this.target = target;
    }

    /**
     * proxy: 显示null，实际是代理对象
     * method: public abstract java.lang.String ISubject.request()
     * args: null
     *
     * proxy: 显示null，实际是代理对象
     * method: public abstract void IRequestable.request(java.lang.String)
     * args: ["hello"]
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!"request".equals(method.getName())) {
            return null;
        }

        // com.sun.proxy.$Proxy0
        // com.sun.proxy.$Proxy1
        System.out.println(proxy.getClass().getName());

        // DynamicProxyHandler
        // DynamicProxyHandler
        System.out.println(this.getClass().getName());

        System.out.println("before request");
        Object result = method.invoke(target, args); // 会调用target对象的method方法，携带的参数是args
        System.out.println("after request");
        return result;
    }
}
