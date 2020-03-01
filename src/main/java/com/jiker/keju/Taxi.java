package com.jiker.keju;

public class Taxi {
    private static final int STARTING_PRICE = 6; //起步价格
    private static final int STARTING_DISTANCE = 2;  //起步价限额2km
    private static final double PRICE_PER_KM = 0.8; //普通每千米单价
    private static final double OVER_PRICE_PERCENT = 0.5; //长途加收百分比
    private static final int LONG_DISTANCE = 8;  //长途线
    private static final double WAITING_PRICE = 0.25;  //起步价限额2km

    public  int getPrice(int distance, int watingTime) {
    	if(distance>LONG_DISTANCE)
        return ret3(distance, watingTime);
        if(distance>STARTING_DISTANCE && distance <=LONG_DISTANCE)
        return ret2(distance,watingTime);
        
        return ret1(distance,watingTime);
    }

    private static int ret1(int distance, int watingTime) {
        double waitPrice = watingTime*WAITING_PRICE;
        int price = (int) Math.round((STARTING_PRICE+waitPrice));
        return price;
    }
    private static int ret2(int distance, int watingTime) {
    	 double waitPrice = watingTime*WAITING_PRICE;  
    	int price = (int) Math.round((distance-STARTING_DISTANCE)*PRICE_PER_KM+waitPrice);
           return price+STARTING_PRICE;
    }
    private static int ret3(int distance, int watingTime) {
    	 double waitPrice = watingTime*WAITING_PRICE;
    	 double price=STARTING_PRICE+(distance-STARTING_DISTANCE)*PRICE_PER_KM+(distance-LONG_DISTANCE)*PRICE_PER_KM*OVER_PRICE_PERCENT+waitPrice;
         return  (int) Math.round(price);
    }
}
