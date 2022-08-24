package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    List<Car> carList = new ArrayList<>();

     {
        carList.add(new Car("BMW","Black",100900));
        carList.add(new Car("AUDI","Red",100000));
        carList.add(new Car("FORD","White",500));
        carList.add(new Car("Kia","Blue",550));
        carList.add(new Car("Nissan","Yellow",600));

    }

    public List<Car> getCars(Integer num) {
        if (num == null || num < 1 || num > 5) {
            num = 5;
        }
        return carList.subList(0, num);
    }


}
