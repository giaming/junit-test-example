package tech.example.mockito.dao;

import java.util.Random;

public class DemoDao {

    public int getDemoStatus(){
        return new Random().nextInt();
    }
}
