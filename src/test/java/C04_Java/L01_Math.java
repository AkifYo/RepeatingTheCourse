package C04_Java;

public class L01_Math {
    public static void main(String[] args) {
        Random();
        Max();
        Min();
    }
    public static void Random(){
        int newR= (int) (Math.random()*10);

        System.out.println(newR);
    }
    public  static  void Max(){
        System.out.println(Math.max(5,2));
    }
    public  static  void Min(){
        System.out.println(Math.min(5,2));
    }
}
