public class GenericTest<datatype> {
    datatype value;

    public GenericTest(datatype value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}
