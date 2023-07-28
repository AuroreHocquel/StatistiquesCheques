package fr.en.statistiquescheques;

import java.util.Scanner;

/**
 * @author AuroreH
 * @date 28 juillet 2023
 */

public class StatistiquesCheques {
    public static void main(String[] args) {

        //Déclaration et initialisation des variables

        int numeroCheque = 0;
        double montantCheque =0;

        int nbTotalCheque = 0;
        double montantTotal = 0;
        double moyenneMontant = 0;

        int nbchequeInf200 = 0;
        double montantChequesInf200 = 0;

        int nbchequeSup200 = 0;
        double montantChequesSup200 = 0;

        int numPetitCheque = 0;
        double montantPetitCheque = 0;

        int numGrandCheque = 0;
        double montantGrandCheque = 0;

        // Declaration Scanner
        Scanner scanner = new Scanner(System.in);

        // Numéro du prochain chèque
        System.out.println("Quel est le numéro du chèque ? (Taper 0 pour sortir)");
        numeroCheque = scanner.nextInt();

        while (numeroCheque != 0)
        {
            // Montant du chèque
            System.out.println("Veuillez saisir le montant du cheque");
            montantCheque = scanner.nextDouble();

            // Incrémentation du nombre de chèques
            nbTotalCheque++;

            // Mise à jour montant total
            montantTotal += montantCheque;

            // Moyenne Montant cheque
            moyenneMontant = montantTotal / nbTotalCheque;

            // Verification du montant par une boucle
            if (montantCheque < 200)
            {
                nbchequeInf200++;
                montantChequesInf200 += montantCheque;
            } else {
                nbchequeSup200++;
                montantChequesSup200 += montantCheque;
            }

            // Verification du chèque le plus petit
            if (montantPetitCheque == 0 || montantCheque < montantPetitCheque)
            {
                numPetitCheque = numeroCheque;
                montantPetitCheque = montantCheque;
            }

            //Verification chèque le plus grand
            if (montantGrandCheque == 0 || montantCheque > montantGrandCheque)
            {
                numGrandCheque = numeroCheque;
                montantGrandCheque = montantCheque;
            }

            // Demande numero du prochain chèque
            System.out.println("Numéro du prochain chèque : ");
            numeroCheque = scanner.nextInt();

        }

        //Affichage des données si au moins un 1 chèque a été saisi
        if (nbTotalCheque > 0)
        {
            System.out.println("Nombre total de chèques : " + nbTotalCheque);
            System.out.println("Le montant total des chèques est de : " + montantTotal);
            System.out.println("La moyenne des montants est de : " + moyenneMontant);
            System.out.println("Il y a " + nbchequeInf200 + " ayant un montant inférieur à 200 €. Pour un montant total de " + montantChequesInf200 + " € ");
            System.out.println("Il y a " + nbchequeSup200 + " ayant un montant inférieur à 200 €. Pour un montant total de " + montantChequesSup200 + " € ");
            System.out.println("Le chèque le plus petit est le cheque n°: " + numPetitCheque + ". Pour un montant de : " + montantPetitCheque + " € ");
            System.out.println("Le chèque le plus grand est le cheque n°: " + numGrandCheque + ". Pour un montant de : " + montantGrandCheque + " € ");
        } else {
            System.out.println("Il n'y a aucun chèque");
        }

        //Fermeture du scanner
        scanner.close();
    }
}