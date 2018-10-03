import com.sun.org.apache.regexp.internal.RE;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    Parent method() throws IOException {
        return new Parent();
    }
}

class Child extends Parent {
    @Override
    Child method() throws FileNotFoundException{
        return new Child();
    }
}

public class OverrideExample {
    public static void main(String[] args) throws Exception{
        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println(parent.method());
        System.out.println(child.method());

    }
}
