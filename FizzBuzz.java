import java.io.* ;
import java.util.* ;
public class FizzBuzz{

    public static void main(String arg[]){
        String str ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Prease input Key") ;
        str = sc.next() ;
        int a = 0 ;
        try{
                a = Integer.parseInt(str) ;
            }
        catch(Exception e){
                System.out.println("Key Value is not number") ;
                return ;
            }
        for(int i = 1; i < (a + 1); i++){
            String outPut = "";
            boolean outPutFlag = false ;
            if( (i % 3) == 0 ){
                outPut += "Fizz" ;
                outPutFlag = true ;
            }
            if( (i % 5) == 0 ){
                outPut += "Buzz" ;
                outPutFlag = true ;
            }
            if(outPutFlag){
                System.out.println(outPut) ;
            }
            else{
                System.out.println(Integer.toString(i)) ;
            }
        }
    }
}
