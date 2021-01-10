package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen bir sayi giriniz");

        int sayi = scanner.nextInt();


        for (int x=0;x<sayi;x++){
            for (int z=0;z<1;z++){
                System.out.println();
            }
            for (int y=0;y<=x;y++){
                faktoriyel(x,y);
            }
        }



    }
    static void faktoriyel(int x,int y){
        int sonuc;
        if(x==0 || y==0){
            sonuc=1;
        }
        else if (x==y){
            sonuc=1;
        }
        else{
            int xFak = 1;
            for (int i=1;i<x+1;i++){
                xFak *= i;
            }
            int yFak=1;
            for (int j=1;j<y+1;j++){
                yFak*=j;
            }
            int eksiFak=1;
            int fark=x-y;
            for (int k=1;k<fark+1;k++){
                eksiFak*=k;
            }
            sonuc=xFak/(yFak*eksiFak);
        }
        System.out.print(sonuc+" ");
    }




}