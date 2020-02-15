/**
 * @author chenyh
 * @date 2020-02-15
 */
public class RequestableProxy implements IRequestable {

    private IRequestable requestable;

    public RequestableProxy(IRequestable requestable) {
        this.requestable = requestable;
    }

    @Override
    public void request(String key) {
        System.out.println("before request");
        requestable.request(key);
        System.out.println("after request");
    }
}
