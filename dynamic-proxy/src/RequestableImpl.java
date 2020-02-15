/**
 * @author chenyh
 * @date 2020-02-15
 */
public class RequestableImpl implements IRequestable {

    @Override
    public void request(String key) {
        System.out.println("do RequestableImpl#request, key = " + key);
    }
}
