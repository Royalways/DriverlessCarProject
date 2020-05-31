package org.roy.quiz.DriverlessCar;

import java.util.Scanner;

import org.roy.quiz.model.Car;
import org.roy.quiz.model.CarInPark;
import org.roy.quiz.model.Park;
import org.roy.quiz.model.RectangularCar;
import org.roy.quiz.util.SettingsGetter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	Park park = null;
    	try {
        	park = SettingsGetter.getConfPark();
		} catch (Exception e) {
			System.out.println("get park with configured parameters fails");
			e.printStackTrace();
		}
        Car myCar = new RectangularCar();
        
        CarInPark carInPark = new CarInPark(park, myCar);
        
        try {
        	System.out.println("The park  dimension:"+park.getX()+"*"+park.getY());
        	System.out.println("A car("+myCar.getPositionX()+","+myCar.getPositionY()+") in the park has prepared, you can try running.");
        	carInPark.getParkMap();
            while (true) {
            	System.out.println("1: exit, 2:move forward, 3:turn clockwise");
            	Scanner sc = new Scanner(System.in); 
                System.out.print("Please entry the command number:"); 
                String num = sc.nextLine(); 
    			if (num.equals("1")) {
    				System.out.println("Exit car experience");
					break;
				}
    			if (num.equals("2")) {
					carInPark.move();
					carInPark.getParkMap();
				}
    			if (num.equals("3")) {
					carInPark.turnClockwise();
					carInPark.getParkMap();
				}
    		}
		} catch (Exception e) {
            System.out.println("Incident may occur to the car in the park");
            e.printStackTrace();
		}

        
    }
}
