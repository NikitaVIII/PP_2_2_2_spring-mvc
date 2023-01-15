package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("model1", 10, "black"));
        cars.add(new Car("model2", 15, "white"));
        cars.add(new Car("model3", 20, "grey"));
        cars.add(new Car("model4", 25, "blue"));
        cars.add(new Car("model5", 30, "red"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}
