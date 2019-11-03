package inner_classes;

public class Main {

    public static void main(String[] args) {

        //inner classes
//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass(10);
//
//        outerClass.aPublic = 5;
//        OuterClass.aPublicStatic = 500;
//        innerClass.accessTest();
//
//        OuterClass outerClass1 = new OuterClass();
//        OuterClass.InnerClass testInner = outerClass1.new InnerClass(20);
//        testInner.accessTest();

        //static nested classes

        OuterClass outerClass = new OuterClass();
        OuterClass.MyNested nested = new OuterClass.MyNested();
        nested.accessTest();
    }

}
