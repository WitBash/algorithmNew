package com.bashko.homework5;

public class TowersOfHanoi {
    private static int Ndisk = 3;
    public static void main(String[] args) {
        towers(Ndisk,'A','B','C');
    }

    public static void towers(int disk, char firstTower, char mediumTower,char endTower){
        if (disk == 1){
            System.out.println("Диск 1 из " + firstTower + " в " + endTower);
        }
        else  {
            towers( disk-1,firstTower,endTower,mediumTower);
            System.out.println("Диск "+ disk + " из " + firstTower + " в " + endTower);
            towers(disk-1,mediumTower,firstTower,endTower);
        }
    }
}
