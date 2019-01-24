package appmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args){
        String[] langs = {"Java","PHP","JavaScript","Python"};

        List languages = Arrays.asList("Java","C++","JavaBlahBlah","Coffeeeeeeeee");

        for (Object l : languages) {
            System.out.println("I want some " + l);
        }
    }
}
