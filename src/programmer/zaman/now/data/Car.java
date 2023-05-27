package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Car", tags = {"Apllication","Java"})

public interface Car extends HashBrand,IsMaintenance{

    void drive();
    int getTier();
    default boolean isBig(){
       return false;
    }
}
