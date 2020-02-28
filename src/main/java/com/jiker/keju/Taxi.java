package com.jiker.keju;

public class Taxi {
    private static final int STARTING_PRICE = 6; //起步价格
    private static final int STARTING_DISTANCE = 2;  //起步价限额2km
    private static final double PRICE_PER_KM = 0.8; //普通每千米单价
    private static final double OVER_PRICE_PERCENT = 0.5; //长途加收百分比
    private static final int LONG_DISTANCE = 8;  //长途线
    private static final double WAITING_PRICE = 0.25;  //起步价限额2km

    public static int getPrice(int distance, int watingTime) {
        double waitPrice = watingTime*WAITING_PRICE;
        if(distance<= STARTING_DISTANCE){
            int price = (int) Math.round((STARTING_PRICE+waitPrice));
            return price;
        }
        if(distance>STARTING_DISTANCE && distance <=LONG_DISTANCE){
            int price = (int) Math.round((distance-STARTING_DISTANCE)*PRICE_PER_KM+waitPrice);
            return price+STARTING_PRICE;
        }
        if(distance>LONG_DISTANCE){
            double price=STARTING_PRICE+(distance-STARTING_DISTANCE)*PRICE_PER_KM+(distance-LONG_DISTANCE)*PRICE_PER_KM*OVER_PRICE_PERCENT+waitPrice;
            return  (int) Math.round(price);
        }
        return 0;
    }
}
