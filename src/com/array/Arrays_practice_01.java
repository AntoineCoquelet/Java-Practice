package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
PRACTICE: Rechercher des valeurs communes à deux tableaux

1) Définir deux tableaux de 10 éléments de type entier et les remplir
   avec des valeurs aleatoires comprises entre 1 et 10
2) afficher le contenu de ces deux tableaux élément par élément

*/

public class Arrays_practice_01 {

    // function hashset pour trouver les elements communs
    public static void elementsCommuns(int[] arr1,int[] arr2)
    {
        // init HashSet
        Set<Integer> hash1 = new HashSet<>();
        Set<Integer> hash2 = new HashSet<>();

        // Ajout des elements du tableau 1
        for (int i : arr1) {
            hash1.add(i);
        }

        // Ajout des elements du tableau 2
        for (int i : arr2) {
            hash2.add(i);
        }

        // retainAll() pour trouver les elements communs
        hash1.retainAll(hash2);
        System.out.println("Elements communs aux deux tableaux: \n" + hash1);
    }

    //Tableau de nombres Random
    public static void tableauRandom(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt((10 - 1) + 1) + 1;;
        }
    }

    // afficher Tableau
    public static void afficherTableau(int[] arr, int numTableau){
        System.out.println("Tableau " + numTableau + " : \n" + Arrays.toString(arr));
    }

    // afficher Sum des elements du Tableau
    public static void afficherSum(int[] arr, int numTableau){
        int sumArray[] = arr;
        int sum = 0;
        for (int i : sumArray) {
            sum += i;
        }
        System.out.println("La somme des éléments du tableau " + numTableau + " = " + sum);
    }

    // methode main
    public static void main(String[] args)
    {
        int[] arr1 = new int[10];
        tableauRandom(arr1);

        int[] arr2 = new int[10];
        tableauRandom(arr2);

        // afficher Tableau 1
        afficherTableau(arr1, 1);

        // afficher la sommes des elements Tableau 1
        afficherSum(arr1, 1);

        // afficher tableau 2
        afficherTableau(arr2, 2);

        // afficher la sommes des elements Tableau 2
        afficherSum(arr2, 2);
        // afficher les elements communs aux deux tableaux
        elementsCommuns(arr1, arr2);
    }
}
