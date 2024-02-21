public class introduction {
    public static void main(String[] args){
        int x = 134;
        int y = 245;
        System.out.println("Before swapping variables are: "+ x + " and "+ y);
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping variables are: "+ x + " and "+ y);
    }
}
