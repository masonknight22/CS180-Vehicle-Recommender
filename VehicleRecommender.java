import java.util.Scanner;

/**
 * VehicleRecommender
 *
 * a program that will recommend a car based on the input of the user
 *
 * CS 180 Lectures
 *
 * @author Mason Knight, 14
 * @version February 14, 2021
 *
 */

public class VehicleRecommender {
    public static final String WELCOME_MESSAGE = "Welcome to the Vehicle Recommender! Would you like to participate?";
    public static final String TRAVEL_MEDIUM = "Does the vehicle need to travel on land, water, air, or space?";
    public static final String LAND_PASSENGERS = "How many passengers does the vehicle need to transport?";
    public static final String LAND_TRAVEL_SPEED = "Do you need to travel quickly?";
    public static final String LAND_FUEL_ECONOMY = "Is fuel economy important?";
    public static final String LAND_COMMERCIAL = "Do you need to transport passengers commercially?";
    public static final String WATER_GOODS = "Do you plan on carrying a large amount of material?";
    public static final String WATER_AIRPLANES = "Do airplanes need to take off from the vehicle?";
    public static final String WATER_SPEED = "Is speed important?";
    public static final String WATER_LUXURY = "Is luxury important?";
    public static final String WATER_UNDERWATER = "Do you need to travel underwater?";
    public static final String AIR_QUICKLY = "Do you need to travel quickly?";
    public static final String AIR_PASSENGERS = "Can other travelers join you?";
    public static final String AIR_WATER = "Do you need to land in the water?";
    public static final String AIR_LANDSCAPES = "Can you use natural landscapes when taking off?";
    public static final String NO_PARTICIPATION = "That's too bad. Maybe next time!";
    public static final String GOODBYE_MESSAGE = "Thank you for participating. Goodbye!";
    public static final String ERROR_MESSAGE = "Error: Unable to process response. Ending program... ";

    // ------------------------- DO NOT MODIFY ABOVE -------------------------

    // IMPLEMENT YOUR SOLUTION HERE



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);

        String welcome = scan.nextLine();

        if (welcome.equalsIgnoreCase("yes") ){

            System.out.println(TRAVEL_MEDIUM);

        String medium = scan.nextLine();

        if (medium.equalsIgnoreCase("Land")) {

            System.out.println(LAND_PASSENGERS);

            String landpassengers = scan.nextLine();

            if (landpassengers.equals("1")) {

                System.out.println(LAND_TRAVEL_SPEED);

                String landspeed = scan.nextLine();

                if (landspeed.equalsIgnoreCase("yes")){

                    System.out.println("You need a Sports car!");
                }

                else if (landspeed.equalsIgnoreCase("no")){

                    System.out.println("You need a Bicycle!");
                }
                else{
                    System.out.println("Error: Unable to process response. Ending program...");
                }



            }

            else if (landpassengers.equals("1-4")){

                System.out.println(LAND_FUEL_ECONOMY);

                String fuel = scan.nextLine();

                if (fuel.equalsIgnoreCase("yes")){

                    System.out.println("You need a Hybrid!");
                }

                else if (fuel.equalsIgnoreCase("no")){

                    System.out.println("You need a Sedan!");
                }
                else{
                    System.out.println("Error: Unable to process response. Ending program...");
                }
            }
             else if (landpassengers.equals("4+")){

                 System.out.println(LAND_COMMERCIAL);

                String commercial = scan.nextLine();

                 if (commercial.equalsIgnoreCase("yes")){

                     System.out.println("You need a Greyhound bus!");
                 }

                 else if (commercial.equalsIgnoreCase("no")){

                     System.out.println("You need a Mini-van!");
                 }
                 else{
                     System.out.println("Error: Unable to process response. Ending program...");
                 }
            }
            else{
                System.out.println("Error: Unable to process response. Ending program...");
            }
        }

        else if (medium.equalsIgnoreCase("water")){

            System.out.print(WATER_GOODS);

            String goods = scan.nextLine();

            if (goods.equalsIgnoreCase("yes")){

                System.out.println(WATER_AIRPLANES);

                String airplanes = scan.nextLine();

                if (airplanes.equalsIgnoreCase("yes")){

                    System.out.println("You need a Aircraft carrier!");
                }

                else if (airplanes.equalsIgnoreCase("no")){

                    System.out.println("You need a Cargo ship!");
                }
                else{
                    System.out.println("Error: Unable to process response. Ending program...");
                }

            }
            else if (goods.equalsIgnoreCase("no")){

                System.out.println(WATER_SPEED);

                String waterspeed = scan.nextLine();

                if (waterspeed.equalsIgnoreCase("yes")){

                    System.out.println(WATER_LUXURY);

                    String waterluxury = scan.nextLine();

                    if (waterluxury.equalsIgnoreCase("yes")){

                        System.out.println("You need a Yacht!");
                    }
                    else if (waterluxury.equalsIgnoreCase("no")){

                        System.out.println("You need a Speedboat!");
                    }
                    else{
                        System.out.println("Error: Unable to process response. Ending program...");
                    }
                }
                else if (waterspeed.equalsIgnoreCase("no")){

                    System.out.println(WATER_UNDERWATER);

                    String underwater = scan.nextLine();

                    if (underwater.equalsIgnoreCase("yes")){

                        System.out.println("You need a Submarine!");
                    }
                    else if (underwater.equalsIgnoreCase("no")){

                        System.out.println("You need a Sailboat!");
                    }
                    else{
                        System.out.println("Error: Unable to process response. Ending program...");
                    }
                }
                else{
                    System.out.println("Error: Unable to process response. Ending program...");
                }



            }
            else{
                System.out.println("Error: Unable to process response. Ending program...");
            }
        }
        else if (medium.equalsIgnoreCase("air")){

            System.out.println(AIR_QUICKLY);

            String airquickly = scan.nextLine();

            if (airquickly.equalsIgnoreCase("yes")){

                System.out.println(AIR_PASSENGERS);

                String airpassengers = scan.nextLine();

                if (airpassengers.equalsIgnoreCase("yes")){

                    System.out.println("You need a Passenger jet!");
                }

                else if (airpassengers.equalsIgnoreCase("no")){

                    System.out.println(("You need a Private jet!"));
                }
                else{
                    System.out.println("Error: Unable to process response. Ending program...");
                }
            }

            else if (airquickly.equalsIgnoreCase("no")){

                System.out.println(AIR_WATER);

                String airwater = scan.nextLine();

                if (airwater.equalsIgnoreCase("yes")){

                    System.out.println("You need a Seaplane!");
                }
                else if (airwater.equalsIgnoreCase("no")){

                    System.out.println(AIR_LANDSCAPES);

                    String airlandscapes = scan.nextLine();

                    if (airlandscapes.equalsIgnoreCase("yes")){

                        System.out.println("You need a Hang glider!");

                    }

                    else if(airlandscapes.equalsIgnoreCase("no")){

                        System.out.println("You need a Hover craft");
                    }

                    else{
                        System.out.println("Error: Unable to process response. Ending program...");
                    }
                }
                else{
                    System.out.println("Error: Unable to process response. Ending program...");
                }

            }
            else{
                System.out.println("Error: Unable to process response. Ending program...");
            }
        }
        else if (medium.equalsIgnoreCase("space")){

            System.out.println("You need a Space ship!");
        }
        else{
            System.out.println("Error: Unable to process response. Ending program...");


        }

        System.out.println("Thank you for participating. Goodbye!");


        }

        else if (welcome.equalsIgnoreCase("no")){

            System.out.println(NO_PARTICIPATION);
        }

        else{
            System.out.println("Error: Unable to process response. Ending program...");
        }







    }
}
