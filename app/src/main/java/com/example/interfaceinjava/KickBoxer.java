package com.example.interfaceinjava;

public class KickBoxer implements Fighting{


    @Override
    public String throwJab() {
        return "Through Harder Jab";
    }

    @Override
    public String throwCross() {
        return "Throw Harder Cross";
    }

    @Override
    public String throwHook() {
        return "Throw Harder Hook";
    }

    @Override
    public String throwUppercut() {
        return "Throw Harder Uppercut";
    }
}