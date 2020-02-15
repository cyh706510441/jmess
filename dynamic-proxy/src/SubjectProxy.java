/**
 * @author chenyh
 * @date 2020-02-15
 */
public class SubjectProxy implements ISubject {

    private ISubject subject;

    public SubjectProxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public String request() {
        System.out.println("before request");
        String result = subject.request();
        System.out.println("after request");
        return result;
    }
}
