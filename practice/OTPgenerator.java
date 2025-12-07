package practice;
import java.util.Random;
//Otp Generator  Code
    public class OTPgenerator {
        static void main(String[] args) {
            Random r = new Random();
            String otp = "";
            for(int i=1; i<=4 ; i++){ //run the loop till how many digits u want - in this case i want 4 digit that's why
                int num = r.nextInt(10); //bound it 10 because it generates numbers b/w 0-9
                otp += num;

            }
            System.out.println("Your Generated OTP is "+otp);
        }
    }

