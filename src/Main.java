import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* generation d'un nombre entier compris entre 1 et 100 */
        int nombre= (int)(Math.random() * 100) +1;
        System.out.println("Bienvenue à Deviner un nombre ");
        System.out.println("Vous devez deviner un nombre compris entre 1 et 100 inclus");

        /* variable pour determiner la perte ou le gain du jeu */
        boolean gagne = false;

        /* boucle for pour le nombre d'éssai */
        for (int i = 1; i <= 10; i++) {
            /*Variable pour récuperer la saisie de l'utilisateur */
            Scanner scanner=new Scanner(System.in);
            System.out.println("Essai N°"+i);
            int numero=scanner.nextInt();

            /* différentes conditions de gain ou de perte avec indice */
            if (numero==nombre){
                System.out.println("Félicitation, Vous avez trouvé le bon nombre qui était "+nombre);
                gagne = true;
             break;
            } else if (numero<nombre) {
                System.out.println("INDICE : Votre Nombre est inférieur au nombre Aléatoire , réessayer");
            }
            else {
                System.out.println("INDICE : Votre Nombre est Supérieur au nombre Aléatoire , réessayer");
            }
        }

    }
}
