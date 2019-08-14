import java.io.IOException;
/**
 * Created by Templar on 26.07.2019.
 */
public class ExceptionExample11 {

    public class Parent {
        public void f() throws IOException, InterruptedException {}
    }

    class ChildB extends Parent {
        @Override
        public void f() throws Exception {}
    }
}
