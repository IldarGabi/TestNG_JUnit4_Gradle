package ru.netology;

public class CashbackHacker {
    public final int boundary = 1000;
    public int remain(int amount) {
        if (amount==1000){
            return (boundary - amount) % boundary;
        }
        return boundary - amount % boundary;
    }
}
