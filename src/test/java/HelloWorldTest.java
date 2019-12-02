import org.junit.jupiter.api.Assertions;

class HelloWorldTest {

    @org.junit.jupiter.api.Test
    void someMethod() {
        HelloWorld t = new HelloWorld();
        Assertions.assertEquals( t.someMethod() , 1);
    }
}