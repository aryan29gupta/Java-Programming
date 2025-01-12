//The motive of my project is to build a flight booking system which allows you to book tickets for upcoming flights to your dream destination. The project displays your ticket at the end with all the necessary details.
//I have used basic Java programming to complete this task.


import java.util.*;
public class FLYHIGH{
    //declaration of functions to input necessary details 
    public static String Name() {
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        String NAME= sc.next();
        return NAME;
    }

    public static String Where() {
        System.out.println("Enter place you want to visit");
        Scanner sc = new Scanner(System.in);
        String WHERE = sc.next();
        return WHERE;
    }

    public static int Days() {
        System.out.println("Enter duration for your trip (no of days)");
        Scanner sc = new Scanner (System.in);
        int DAYS=sc.nextInt();
        return DAYS;
        
    }

    public static int Frequency() {
        System.out.println("Please tell if you want ticket for one side or both sides(Enter 1 or 2)");
        Scanner sc = new Scanner (System.in);
        int frequency=sc.nextInt();
        return frequency;        
    }
    public static String  Source() {
        System.out.println("Enter your start destination");
        Scanner sc = new Scanner(System.in);
        String SOURCE = sc.next();
        return SOURCE;
    }

    //calling of functions
    public static void main(String[] args){
            System.out.println("--------------------------");
            System.out.println("\n    WELCOME TO FLYHIGH    \n");
            System.out.println("--------------------------");
            System.out.println("YOU CAN BOOK UPCOMING FLIGHT TICKETS HERE!!!!!\n");
            String NAME = Name();
            String WHERE = Where();
            int DAYS = Days();
            int frequency = Frequency();
            String SOURCE = Source();


            //checking if trip is one sided or two sided
            //Code for one sided trip
            if (frequency==1){
                
                System.out.println("Listed Below are the Details for Different Airlines\n");
                System.out.println("1)VISTARA\n2)INDIGO\n3)AIR INDIA\n4)SPICE JET\n\n");

                System.out.println("Enter Choice\n");
                Scanner sc = new Scanner (System.in);
                int choice=sc.nextInt();
                //Necessary information about all the airlines is listed so that the customer can have the right choice
                switch (choice){
                    case 1: {
                        System.out.println("WELCOME TO VISTARA AIRLINES");
                        System.out.println("Description: Our Airline offers best quality food and taste. We have Comfortable seats and experienced crew\n");
                        System.out.println("Flight ticket for your destination costs 4000 INR");
                        System.out.println("Enter date (in ddmmyy format) :  ");
                        int date = sc.nextInt();
                        System.out.println("Slot Avalaible!!");
                        System.out.println("TIME: 12:00AM IST ");
                        System.out.println("To book ticket press 1\n");
                        int ch=sc.nextInt();
                        if (ch==1){
                            System.out.println("Proceed to pay by entering the amount i.e 4000 INR\n");
                            int price=sc.nextInt();
                            if (price == 4000){
                                System.out.println("Processing Payment......");
                                System.out.println("PAYMENT SUCCESSFUL!!!");
                                System.out.println("Here is your ticket\n");
                                //making of ticket
                                System.out.println("[                 VISTARA AIRLINES                  ]");
                                System.out.println("|    NAME :  "+NAME +"      "+"   DESINATION:  "+WHERE+"         |");
                                System.out.println("|    DURATION :  "+DAYS +" DAYS  "+"  TIME : 12:00 AM          |");
                                System.out.println("[            TICKET FOR ONE SIDE TRIP               ]\n");
                                System.out.println("\nTHANKS FOR USING OUR AIRLINE!!!\n");
                            break;
                            }       
                        }
                    }
                    case 2: {
                        System.out.println("WELCOME TO INDIGO AIRLINES");
                        System.out.println("Description: Our Airline offers the best comfortable seats and the most luxurious travel experience. We have a 5 star rating globally\n");
                        System.out.println("Flight ticket for your destination costs 6000 INR");
                        System.out.println("Enter date (in ddmmyy format) :  ");
                        int date = sc.nextInt();
                        System.out.println("Slot Avalaible!!");
                        System.out.println("TIME: 12:00AM IST ");
                        System.out.println("To book ticket press 1\n");
                        int ch=sc.nextInt();
                        if (ch==1){
                            System.out.println("Proceed to pay by entering the amount i.e 6000 INR\n");
                            int price=sc.nextInt();
                            if (price == 6000){
                                System.out.println("Processing Payment......");
                                System.out.println("PAYMENT SUCCESSFUL!!!");
                                System.out.println("Here is your ticket\n");
                                //making of ticket
                                System.out.println("[                 INDIGO AIRLINES                   ]");
                                System.out.println("|    NAME :  "+NAME +"      "+"   DESINATION:  "+WHERE+"         |");
                                System.out.println("|    DURATION :  "+DAYS +" DAYS  "+"  TIME : 12:00 AM          |");
                                System.out.println("[            TICKET FOR ONE SIDE TRIP               ]\n");
                                System.out.println("\nTHANKS FOR USING OUR AIRLINE!!!\n");
                            break;
                        }

                    }
                    }
                    case 3: {
                        System.out.println("WELCOME TO AIR INDIA");
                        System.out.println("Description: Air India is the most well known and famous Airline globally. We donate 10% of our daily earning to Cancer patients and other social welfares\n");
                        System.out.println("Flight ticket for your destination costs 3000 INR");
                        System.out.println("Enter date (in ddmmyy format) :  ");
                        int date = sc.nextInt();
                        System.out.println("Slot Avalaible!!");
                        System.out.println("TIME: 12:00AM IST ");
                        System.out.println("To book ticket press 1\n");
                        int ch=sc.nextInt();
                        if (ch==1){
                            System.out.println("Proceed to pay by entering the amount i.e 3000 INR\n");
                            int price=sc.nextInt();
                            if (price == 3000){
                                System.out.println("Processing Payment......");
                                System.out.println("PAYMENT SUCCESSFUL!!!");
                                System.out.println("Here is your ticket\n");
                                //making of ticket
                                System.out.println("[                    AIR INDIA                     ]");
                                System.out.println("|    NAME :  "+NAME +"      "+"   DESINATION:  "+WHERE+"         |");
                                System.out.println("|    DURATION :  "+DAYS +" DAYS  "+"  TIME : 12:00 AM          |");
                                System.out.println("[            TICKET FOR ONE SIDE TRIP               ]\n");
                                System.out.println("\nTHANKS FOR USING OUR AIRLINE!!!\n");
                        break;
                            }
                        }
                    }
                    case 4: {
                        System.out.println("WELCOME TO SPICE JET");
                        System.out.println("Description: Our Airline offers the most experienced crew members and the best food quality. We have the best features and the facilitiest offered to you which make your flying journey memorable.\n");
                        System.out.println("Flight ticket for your destination costs 8000 INR");
                        System.out.println("Enter date (in ddmmyy format) :  ");
                        int date = sc.nextInt();
                        System.out.println("Slot Avalaible!!");
                        System.out.println("TIME: 12:00AM IST ");
                        System.out.println("To book ticket press 1\n");
                        int ch=sc.nextInt();
                        if (ch==1){
                            System.out.println("Proceed to pay by entering the amount i.e 8000 INR\n");
                            int price=sc.nextInt();
                            if (price == 8000){
                                System.out.println("Processing Payment......");
                                System.out.println("PAYMENT SUCCESSFUL!!!");
                                System.out.println("Here is your ticket\n");
                                //making of ticket
                                System.out.println("[                    SPICE JET                      ]");
                                System.out.println("|    NAME :  "+NAME +"      "+"   DESINATION:  "+WHERE+"          |");
                                System.out.println("|    DURATION :  "+DAYS +" DAYS  "+"  TIME : 12:00 AM          |");
                                System.out.println("[            TICKET FOR ONE SIDE TRIP               ]\n");
                                System.out.println("\nTHANKS FOR USING OUR AIRLINE!!!\n");
                        break;
                            }
                        }
                    }
                    default: {
                        System.out.println("PLEASE ENTER VALID CHOICE!!!!");
                    }
                }
            }
            //Code for two sided trips
            else if(frequency==2){
                
                System.out.println("Listed Below are the Details for Different Airlines\n");
                System.out.println("1)VISTARA\n2)INDIGO\n3)AIR INDIA\n4)SPICE JET\n\n");

                System.out.println("Enter Choice\n");
                Scanner sc = new Scanner (System.in);
                int choice=sc.nextInt();

                switch (choice){
                    case 1: {
                        System.out.println("WELCOME TO VISTARA AIRLINES");
                        System.out.println("Description: Our Airline offers best quality food and taste. We have Comfortable seats and experienced crew\n");
                        System.out.println("Flight ticket for your destination costs 8000 INR");
                        System.out.println("Enter date of 1st trip(in ddmmyy format) :  ");
                        int date = sc.nextInt();
                        System.out.println("Both Trips Slot Avalaible!!");
                        System.out.println("TIME: 12:00AM IST (for both trips)");
                        System.out.println("To book ticket press 1\n");
                        int ch=sc.nextInt();
                        if (ch==1){
                            System.out.println("Proceed to pay by entering the amount i.e 8000 INR\n");
                            int price=sc.nextInt();
                            if (price == 8000){
                                System.out.println("Processing Payment......");
                                System.out.println("PAYMENT SUCCESSFUL!!!");
                                System.out.println("Here is your ticket\n");
                                //making of ticket
                                System.out.println("[                 VISTARA AIRLINES                  ]");
                                System.out.println("|    NAME :  "+NAME +"      "+"   DESINATION:  "+WHERE+"         |");
                                System.out.println("|    DURATION :  "+DAYS +" DAYS  "+"  TIME : 12:00 AM          |");
                                System.out.println("[            TICKET FOR TWO SIDE TRIP               ]\n\n");
                                System.out.println("\nTHANKS FOR USING OUR AIRLINE!!!\n");
                            break;
                            }       
                        }
                    }
                    case 2: {
                        System.out.println("WELCOME TO INDIGO AIRLINES");
                        System.out.println("Description: Our Airline offers the best comfortable seats and the most luxurious travel experience. We have a 5 star rating globally\n");
                        System.out.println("Flight ticket for your destination costs 12000 INR");
                        System.out.println("Enter date of 1st trip(in ddmmyy format) :  ");
                        int date = sc.nextInt();
                        System.out.println("Both Trips Slot Avalaible!!");
                        System.out.println("TIME: 12:00AM IST (for both trips)");
                        System.out.println("To book ticket press 1\n");
                        int ch=sc.nextInt();
                        if (ch==1){
                            System.out.println("Proceed to pay by entering the amount i.e 12000 INR\n");
                            int price=sc.nextInt();
                            if (price == 12000){
                                System.out.println("Processing Payment......");
                                System.out.println("PAYMENT SUCCESSFUL!!!");
                                System.out.println("Here is your ticket\n");
                                //making of ticket
                                System.out.println("[                 INDIGO AIRLINES                   ]");
                                System.out.println("|    NAME :  "+NAME +"      "+"   DESINATION:  "+WHERE+"         |");
                                System.out.println("|    DURATION :  "+DAYS +" DAYS  "+"  TIME : 12:00 AM          |");
                                System.out.println("[            TICKET FOR TWO SIDE TRIP               ]\n");
                                System.out.println("\nTHANKS FOR USING OUR AIRLINE!!!\n");
                            break;
                        }

                    }
                    }
                    case 3: {
                        System.out.println("WELCOME TO AIR INDIA");
                        System.out.println("Description: Air India is the most well known and famous Airline globally. We donate 10% of our daily earning to Cancer patients and other social welfares\n");
                        System.out.println("Flight ticket for your destination costs 6000 INR");
                        System.out.println("Enter date of 1st trip(in ddmmyy format) :  ");
                        int date = sc.nextInt();
                        System.out.println("Both Trips Slot Avalaible!!");
                        System.out.println("TIME: 12:00AM IST (for both trips)");
                        System.out.println("To book ticket press 1\n");
                        int ch=sc.nextInt();
                        if (ch==1){
                            System.out.println("Proceed to pay by entering the amount i.e 6000 INR\n");
                            int price=sc.nextInt();
                            if (price == 6000){
                                System.out.println("Processing Payment......");
                                System.out.println("PAYMENT SUCCESSFUL!!!");
                                System.out.println("Here is your ticket\n");
                                //making of ticket
                                System.out.println("[                    AIR INDIA                     ]");
                                System.out.println("|    NAME :  "+NAME +"      "+"   DESINATION:  "+WHERE+"         |");
                                System.out.println("|    DURATION :  "+DAYS +" DAYS  "+"  TIME : 12:00 AM          |");
                                System.out.println("[            TICKET FOR TWO SIDE TRIP               ]\n");
                                System.out.println("\nTHANKS FOR USING OUR AIRLINE!!!\n");
                        break;
                            }
                        }
                    }
                    case 4: {
                        System.out.println("WELCOME TO SPICE JET");
                        System.out.println("Description: Our Airline offers the most experienced crew members and the best food quality. We have the best features and the facilitiest offered to you which make your flying journey memorable.\n");
                        System.out.println("Flight ticket for your destination costs 16000 INR");
                        System.out.println("Enter date of 1st trip(in ddmmyy format) :  ");
                        int date = sc.nextInt();
                        System.out.println("Both Trips Slot Avalaible!!");
                        System.out.println("TIME: 12:00AM IST (for both trips)");
                        System.out.println("To book ticket press 1\n");
                        int ch=sc.nextInt();
                        if (ch==1){
                            System.out.println("Proceed to pay by entering the amount i.e 16000 INR\n");
                            int price=sc.nextInt();
                            if (price == 16000){
                                System.out.println("Processing Payment......");
                                System.out.println("PAYMENT SUCCESSFUL!!!");
                                System.out.println("Here is your ticket\n");
                                //making of ticket
                                System.out.println("[                    SPICE JET                      ]");
                                System.out.println("|    NAME :  "+NAME +"      "+"   DESINATION:  "+WHERE+"         |");
                                System.out.println("|    DURATION :  "+DAYS +" DAYS  "+"  TIME : 12:00 AM          |");
                                System.out.println("[            TICKET FOR TWO SIDE TRIP               ]\n");
                                System.out.println("\nTHANKS FOR USING OUR AIRLINE!!!\n");
                        break;
                            }
                        }
                    }
                    default: {
                        System.out.println("PLEASE ENTER VALID CHOICE!!!!");
                    }
                }
            }

    }
}



