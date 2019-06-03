package model;

import java.util.ArrayList;
import java.util.List;

public class Server extends FOHEmployee {
    private static final String PREFIX = "SERVER - ";

    public Server(Dish dish) {
        super(dish);
    }

    public String getPrefix(){ return this.PREFIX; }

}
