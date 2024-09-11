package ru.netology.javaqa;
public class  CashbackHackService{

    public int remain(int amount) {
        int boundary = 1000;
        return boundary - amount % boundary;
    }
}

