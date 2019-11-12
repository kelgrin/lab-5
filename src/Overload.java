public class Overload {
    public static void overload(){
        OverloadDemo ob = new OverloadDemo();
        double result;
        //Вызвать все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Результат вывода ob.test(123.25): " + result);
    }
}
