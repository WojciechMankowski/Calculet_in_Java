package pl.mankowskiwwojciech;

import java.util.LinkedList;
import java.util.List;

public class OperationHistory {
     private List<ElementHistori> historis;
     private int len_list_operation;

    public OperationHistory(int len_list_operation) {
        historis = new LinkedList<>();
        this.len_list_operation = len_list_operation;
    }

    public void add(String key, Object value){
        ElementHistori element = new ElementHistori(key, value);
        historis.add(element);
    }

    public void PrintOut(){
        for (ElementHistori element: historis){
            System.out.println(element.getName() + " = " + element.getValue());
        }
    }


    }





