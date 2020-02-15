/**
 * @author chenyh
 * @date 2020-02-15
 */
public class SubjectImpl implements ISubject {

    @Override
    public String request() {
        System.out.println("do SubjectImpl#request");
        return "ok";
    }
}
