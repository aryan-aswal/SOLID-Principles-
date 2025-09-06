public class Base implements A, B{
    @Override
    public void foo() {
        A.super.foo();
    }
}
