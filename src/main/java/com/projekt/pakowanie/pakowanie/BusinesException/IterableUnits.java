package com.projekt.pakowanie.pakowanie.BusinesException;

import java.util.ArrayList;
import java.util.List;

public class IterableUnits {
    public static <T>List<T> iterableToList(Iterable<T>iterable){
        List<T>resultList=new ArrayList<>();
        iterable.forEach(t->resultList.add(t));
        return resultList;



    }



}
