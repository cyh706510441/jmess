import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author chenyh
 * @date 2020-03-01
 */
public class Demo {

    public static void main(String[] args) {
        ExtensionLoader<Animal> extensionLoader = ExtensionLoader.getExtensionLoader(Animal.class);
        System.out.println(extensionLoader.getExtension("tom").sayHello());
        System.out.println(extensionLoader.getExtension("jerry").sayHello());
    }
}
