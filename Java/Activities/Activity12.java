

public class Activity12 {
    public static void main(String[] args) {

        Addable ad1 = ( num1,num2 ) -> (num1+num2);

        System.out.println(ad1.add(2,5));

        Addable ad2 = (int num1,int num2) -> {
            return (num1+num2);
        };
        System.out.println(ad1.add(89,100));
    }
}

interface Addable {
     int add(int num1, int num2);
}
