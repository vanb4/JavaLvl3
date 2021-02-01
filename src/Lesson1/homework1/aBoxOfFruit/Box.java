package Lesson1.homework1.aBoxOfFruit;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> box = new ArrayList<>();

    public Box(){

    }

    public float getWeight(){
        float weight = 0.0f;
        for(T o : box){
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox){
        float epsilon = 0.000001f;
        if(Math.abs(getWeight() - anotherBox.getWeight()) < epsilon){
            return true;
        }else{
            return false;}
    }

    public void lard(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void AddToBox(T fruit, int amount){
        for(int i=0; i<amount; i++){
            box.add(fruit);
        }
    }
}
