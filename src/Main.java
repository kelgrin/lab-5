public class Main {
    public static void main(String args[]){
        Overload d  = new Overload();
        d.overload();
        System.out.println("------------------------------------------");
        Overload1 d1 = new Overload1();
        d1.overload1();
        System.out.println("------------------------------------------");
        FindAreas si = new FindAreas();
        si.findareas();
        System.out.println("------------------------------------------");
        AbstractDemo ki = new AbstractDemo();
        ki.abstractdemo();
    }
}
