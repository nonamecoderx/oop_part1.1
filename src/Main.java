public class Main {
    public static void main(String[] args) {
        //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        car lada = new car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "желтый";
        lada.productionYear = 2015;
        lada.productionCountry = "Россия";
        //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        car audi = new car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "черный";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        car bmw = new car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "черный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        car kia = new car();
        kia.brand = "KIA";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016.
        car hyundai = new car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        System.out.println("Автомобиль: " + lada.brand + " " + lada.model + ", объем двигателя: " + lada.engineVolume + ", цвет: " + lada.color + ", год выпуска: " + lada.productionYear + ", сборка: " + lada.productionCountry);
        System.out.println("Автомобиль: " + audi.brand + " " + audi.model + ", объем двигателя: " + audi.engineVolume + ", цвет: " + audi.color + ", год выпуска: " + audi.productionYear + ", сборка: " + audi.productionCountry);
        System.out.println("Автомобиль: " + bmw.brand + " " + bmw.model + ", объем двигателя: " + bmw.engineVolume + ", цвет: " + bmw.color + ", год выпуска: " + bmw.productionYear + ", сборка: " + bmw.productionCountry);
        System.out.println("Автомобиль: " + kia.brand + " " + kia.model + ", объем двигателя: " + kia.engineVolume + ", цвет: " + kia.color + ", год выпуска: " + kia.productionYear + ", сборка: " + kia.productionCountry);
        System.out.println("Автомобиль: " + hyundai.brand + " " + hyundai.model + ", объем двигателя: " + hyundai.engineVolume + ", цвет: " + hyundai.color + ", год выпуска: " + hyundai.productionYear + ", сборка: " + hyundai.productionCountry);


    }
}