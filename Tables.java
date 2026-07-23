public class Tables{
    public static void tab(int a){
        for(int i=1; i<=10;i++){
        System.out.println(a + "->" + i + "="+ (a*i));
        }
    }
    public static void main(String[] args) {
        tab(5);
    }
}

