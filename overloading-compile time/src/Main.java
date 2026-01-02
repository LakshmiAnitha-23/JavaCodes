class OverloadDemo
{
    void m(Object o) { System.out.println("Object version"); }
    void m(String s) { System.out.println("String version"); }

    public static void main(String[] args) {
        OverloadDemo d = new OverloadDemo();
        d.m("hi");
        Object o= "hello";
        d.m(o);
    }
}