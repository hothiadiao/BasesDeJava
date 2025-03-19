import java.util.Scanner;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try 
        {

        System.out.println("Année de naissance: "); 
        int yearOfBirth = sc.nextInt();
        System.out.println(yearOfBirth);
    }
    catch(InputMismatchException e)
    {
        System.out.println("Erreur :"+ e.getMessage());
    }
}
}
