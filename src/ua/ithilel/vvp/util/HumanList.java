package ua.ithilel.vvp.util;

import ua.ithilel.vvp.entities.Human;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HumanList {
    private Human[] humans = new Human[0];


    public void addHuman (Human human){
         humans= Arrays.copyOf(humans,humans.length+1);
         humans[humans.length-1]=human;
    }
    public void deliteHuman (int index){

        for (int i = 0; i < humans.length-1; i++) {
            if (i>=index-1) humans[i]= humans[i+1];
        }
        humans= Arrays.copyOf(humans,humans.length-1);
    }

    public Human getHuman (int index){
        return humans[index];
    }
    public void setHumans(int index, Human value) {
         humans[index]=value;
    }
    public int size (){
        return humans.length;
    }
}
