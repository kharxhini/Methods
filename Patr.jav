public class Patr{
    public static void right(){
        for(int i=0;i<4;i++){
            for(int j=0;j=i+1;j++){
                System.out.print("*");
            }
        }
    }
    System.out.println();
    public static void main(String[] args){
        right();
    }
}