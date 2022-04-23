public class Array {
    public static void main (String[] args){
        String[] cars={"Breeza","Nixon","Alto","Creta","Kia"};

        printarray(cars);

    }
    public static void printarray(String[] car){
        for(int i=0;i<car.length;i++){
            System.out.println(car[i].toUpperCase());
        }
    }
}
