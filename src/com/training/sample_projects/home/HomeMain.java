package com.training.sample_projects.home;

public class HomeMain {
    public static void main(String[] args) {

        Room1 room1 = new Room1();

        room1.setFan("Usha_Fan");
        room1.setBed("Sleep_Well_Bed");
        room1.setAirConditioner("Samsung_Ac");
        room1.setLight("Philips_Light");
        room1.setMirror("Arun_Mirror");
        room1.setDvd("Sony_Dvd");
        room1.setTv("Google_Tv");


        Room2 room2 = new Room2();

        room2.setFan("Crompton_Fan");
        room2.setBed("Wake_Fit_Bed");
        room2.setAirConditioner("Daikin_Ac");
        room2.setLight("Golden_Light");
        room2.setMirror("Kohler_Mirror");
        room2.setHomeTheatre("JBL_HomeTheatre");
        room2.setDesignLight("Louis_Tv");



        Bathroom1 bathroom1 = new Bathroom1();

        bathroom1.setWesternToilet("PerryWare_Toilets");
        bathroom1.setWashBasin("ParryWare_WashBasin");
        bathroom1.setShampoo("Meera_Shampoo");
        bathroom1.setHairConditioner("L'oreal_HairConditioner");
        bathroom1.setTap("Pampay_Taps");
        bathroom1.setSoap("Life_Buoy");
        bathroom1.setShower("Pampay_Shower");


        Bathroom2 bathroom2 = new Bathroom2();

        bathroom2.setIndianToilet("Cera_Toilets");
        bathroom2.setShower("ParryWare_Shower");
        bathroom2.setShampoo("Meera_Shampoo");
        bathroom2.setHairConditioner("L'oreal_HairConditioner");
        bathroom2.setTap("Pampay_Taps");
        bathroom2.setSoap("Life_Buoy");

        Kitchen kitchen = new Kitchen();

        kitchen.setStove("Preethi_Stove");
        kitchen.setRefrigerator("Samsung_Fridge");
        kitchen.setMicrowave("Osho_Microwave");
        kitchen.setCooker("Preethi_Cooker");
        kitchen.setRiceBag("Anand_Rice_Bag");

        StorageRoom storageRoom = new StorageRoom();

        storageRoom.setOldThings(new String[]{"Old_Bicycle", "Old_Bed"});

        PoojaRoom poojaRoom = new PoojaRoom();

        poojaRoom.setAgarBathees("Cycle_AgarBathees");
        poojaRoom.setFlowers("Bjp_Flowers");
        poojaRoom.setGodStatue("RAM");


        Home home = new Home();

        home.setRoom1(room1);
        home.setRoom2(room2);

        home.getRoom1().getAirConditioner();

        home.setBathroom1(bathroom1);
        home.setBathroom2(bathroom2);

        home.setPoojaRoom(poojaRoom);

        home.setKitchen(kitchen);

        home.setStorageRoom(storageRoom);

        System.out.println(home.getRoom1().getTv());
        System.out.println(home.getRoom1().getDvd());
        System.out.println(home.getRoom1().getBed());
        System.out.println(home.getRoom1().getFan());
        System.out.println(home.getRoom1().getAirConditioner());
        System.out.println(home.getRoom1().getLight());
        System.out.println(home.getRoom1().getMirror());

        System.out.println(home.getRoom2().getHomeTheatre());
        System.out.println(home.getRoom2().getDesignLight());
        System.out.println(home.getRoom2().getBed());
        System.out.println(home.getRoom2().getFan());
        System.out.println(home.getRoom2().getAirConditioner());
        System.out.println(home.getRoom2().getLight());
        System.out.println(home.getRoom2().getMirror());

        System.out.println(home.getBathroom1().getWashBasin());
        System.out.println(home.getBathroom1().getWesternToilet());
        System.out.println(home.getBathroom1().getShampoo());
        System.out.println(home.getBathroom1().getShampoo());
        System.out.println(home.getBathroom1().getSoap());
        System.out.println(home.getBathroom1().getTap());
        System.out.println(home.getBathroom1().getHairConditioner());


        System.out.println(home.getBathroom2().getIndianToilet());
        System.out.println(home.getBathroom2().getShampoo());
        System.out.println(home.getBathroom2().getShampoo());
        System.out.println(home.getBathroom2().getSoap());
        System.out.println(home.getBathroom2().getTap());
        System.out.println(home.getBathroom2().getHairConditioner());



        System.out.println(home.getKitchen().toString());
        System.out.println(home.getPoojaRoom().toString());
        System.out.println(home.getStorageRoom().toString());


    }
}
