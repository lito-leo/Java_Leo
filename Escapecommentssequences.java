public class Escapecommentssequences 
{
    public static void main ( String [] args)
    {
        //Cette exercise montre comment faire des commentaire et d'autres séquences d'échappe
        System.out.print( "Apprendre\tJava\n\t le \n \"Hard\"\t \"Way\"\n\n" );
        System.out.print( "\tApprendre Java le\"Hard\" Way!\n" );
        // un autre exemple
        System.out.print( "Salut\n" ); // imprime salut
        System.out.print( "Jello\by\n" ); // Imprime Jelly... remplace o avec y
        /* commentaire en bloc */
        System.out /* testing */ .println( "Dur à croire?" );
        System.out.println( "Surpris? /* abcde */ à quoi pensais tu?" );
        System.out.println( "\\ // -=- \\ //" );
        System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // il faut deux slash
        System.out.print( "Je souhaite que tu comrpend les \"escape sequences\" maintenant.\n" );
        // et commentaires :)
    }
}
