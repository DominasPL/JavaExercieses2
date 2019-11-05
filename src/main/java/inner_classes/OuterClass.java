package inner_classes;

public class OuterClass {

    private int aPrivate = 10;
    public int aPublic = 100;

    private static int aPrivateStatic = 20;
    public static int aPublicStatic = 77;

    //inner class
    class InnerClass {

        private int a;
        //Klasa wewnetrzna nie moze miec statycznych deklaracji
        //private static int aa = 10;

        public InnerClass(int a) {
            this.a = a;
        }

        public void accessTest() {
            System.out.println(aPrivate);
            System.out.println(aPublic);
            System.out.println(OuterClass.aPrivateStatic);
            System.out.println(OuterClass.aPublicStatic);
            System.out.println(" a = " + this.a);
        }
    }

    public void outerClassAccessTest() {
        InnerClass innerClass = new InnerClass(10);
        innerClass.a = 20;
        innerClass.accessTest();
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////


    //static nested class
    static class MyNested {

        private int privateNested = 101;
        public int publicNested = 102;
        private static int staticPrivateNested = 45;
        public static int staticPublicNested = 109;


        public MyNested() {

        }

        void accessTest() {
            aPublicStatic = 10;
            aPrivateStatic = 20;
        }

    }

    public void outerClassTestNestedClasses() {
        MyNested myNested = new MyNested();
        int a = MyNested.staticPrivateNested;
        int b = MyNested.staticPublicNested;
        int c = myNested.privateNested;
        int d = myNested.publicNested;
    }


}
