package StaticKeyWordDemo;

public class StaticDemo {
    public static  int i = 20;
    int j = 35;
    public  static  String hellow(){

        return "hellow world Static method ";
    }
    public  String hi(){
        return "hello non static method ";
    }

    public static void main(String[] args) {
        String message = hellow();

    //    System.out.println(j);
        System.out.println(message);
        StaticDemo staticDemo = new StaticDemo();
        System.out.println(staticDemo.i);
        System.out.println(staticDemo.j);
        String hiMessage = staticDemo.hi();
        System.out.println("creation object for  "+hiMessage);

        // share the static STATE amoung the multiple  objects

        StaticDemo staticDemo1 = new StaticDemo();
        System.out.println(" static 1" + staticDemo1.i);
        System.out.println(" instance1 " +staticDemo1.j);
        staticDemo1.j= 100;
        staticDemo1.i = 100;
        System.out.println(" static 1 :" + staticDemo1.i);
        System.out.println(" instance 1 :" +staticDemo1.j);
        StaticDemo staticDemo2 = new StaticDemo();
        System.out.println(" static 2 :" + staticDemo2.i);
        System.out.println(" instance 2 : " +staticDemo2.j);
        staticDemo1.j= 200;
        staticDemo1.i = 200;
        System.out.println(" static 2 : " + staticDemo2.i);
        System.out.println(" instance 2 : " +staticDemo2.j);

        StaticDemo staticDemo3 = new StaticDemo();
        System.out.println(" static 3 : " + staticDemo3.i);
        System.out.println(" instance 3  : " +staticDemo3.j);
        staticDemo1.j= 300;
        staticDemo1.i = 300;
        System.out.println(" static 3 : " + staticDemo3.i);
        System.out.println(" instance 3 :  " +staticDemo3.j);



    }
}
