package rentcompany;

import java.util.ArrayList;

public class RentCompany {

    private static final String NEWLINE = System.getProperty("line.separator");
    private ArrayList<Car> cars=new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {
        String list="";
        for(Car car : cars){
            list+=car.getName()+" : "+(int)car.getChargeQuantity()+"리터"+NEWLINE;
        }
        return list;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
