import java.util.Scanner;

public class Rudequestions 
{ 
    public static void main ( String [] args)
    {
        String name;
        int age, height;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "Salut c'est quoi ton nom " );
        name = keyboard.next(); //un esapce arrête le programme

        System.out.print( "Bonjour, " + name + "! Age? " );
        age = keyboard.nextInt(); //string

        System.out.println( "Age: " + age + ",Pas tr₧s vieux." );
        System.out.print( "Tu pèse " + name + "? " );
        weight = keyboard.nextDouble(); //string

        System.out.println( weight + "OUCH!" );
        System.out.print("Ton salaire, " + name + "? " );
        income = keyboard.nextDouble(); //string

        System.out.print( "Ce salaire" + income + " par heure?" );
        System.out.println( " Non par année?!" );
        System.out.print( "Merci pour ta patience. " );
        System.out.println( name + "." );
        
        System.out.println("Hauteur?");
        height = keyboard.nextInt();
        System.out.println(height);

        keyboard.close();
    }
}
//Ca fonctionne si ont met un int dans un double car, double a une capacité plus grande
//Int ou Double ne fonctionne pas au lieu de string