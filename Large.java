public class Large {
    public static void mass(int a, int b){
        if(a > b){
            System.out.println("a is larger");
        } else if (a < b){
            System.out.println("b is larger");

        }else{
            System.out.println("a & b are equal");
        }

        
    }
    public static void main(String[] args){
        mass(40, 90);
    }
}
