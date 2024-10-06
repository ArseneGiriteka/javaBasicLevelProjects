import java.security.cert.X509CRL;

public class mixedMessage {
    public static void main(String[] args){
        int x=0;
        int y=0;
        while(x<5){
            if(x<5){
                x=x+1;
                if(x<3){
                    x=x-1;
                }
            }
            y=y+2;
            System.out.print(x+""+y+" ");
            x=x+1;
        }
    }
}
