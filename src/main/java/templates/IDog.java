package templates;

public interface IDog {
//    Note: Trying to test an interface directly feels like a fool's errand. There isn't any code to test :/
//    I think it makes sense to instead make unit tests against a concrete class that implements the interface(s).
    void speak();
    void beg();
    void wagTail();
    void eat();
    void chew();
}
