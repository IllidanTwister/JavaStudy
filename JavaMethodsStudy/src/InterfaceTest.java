public interface InterfaceTest {
    int testReturn1();
    default int testReturn2() {
        return 2;
    }
}
