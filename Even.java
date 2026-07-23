public class Even {
    public static void noop(){
    
        for(int i=0;i<=20;i++){
            if(i % 2 == 0){
              System.out.println("This is even" + i);
            }
        }
    }
    public static void main(String[] args){
        noop();
    }
    
}
