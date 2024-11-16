
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num="0123456789";
        String spec="~!@#$%^&*><()";
        System.out.println("How many letters you want");
        int l=sc.nextInt();
        System.out.println("How many numbers you want");
        int n=sc.nextInt();
        System.out.println("How many special characters you want");
        int s=sc.nextInt();
    
    Random random = new Random();
    ArrayList <Character>  pass = new ArrayList<>();
    while ((l+n+s)>0){
        if (l>0){
        pass.add(letters.charAt(random.nextInt(letters.length())));
        l--;
        }
        if (n>0){
        pass.add(num.charAt(random.nextInt(num.length())));
        n--;
        }
        if (s>0){
        pass.add(spec.charAt(random.nextInt(spec.length())));
        s--;
        }
    }
    Collections.shuffle(pass);
    System.out.println(pass.toString());
    StringBuilder password = new StringBuilder();
        
        for(char ch : pass){
            password.append(ch);
        }
        System.out.println(password);


        
    }
    
}

    
