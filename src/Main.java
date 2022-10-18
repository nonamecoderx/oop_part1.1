public class Main {
    public static void main(String[] args) {
        //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        car lada = new car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        car audi = new car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        car bmw = new car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        car kia = new car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016.
        car hyundai = new car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");
        System.out.println("Автомобиль: " + lada.brand + " " + lada.model + ", объем двигателя: " + lada.engineVolume + ", цвет: " + lada.color + ", год выпуска: " + lada.productionYear + ", сборка: " + lada.productionCountry);
        System.out.println("Автомобиль: " + audi.brand + " " + audi.model + ", объем двигателя: " + audi.engineVolume + ", цвет: " + audi.color + ", год выпуска: " + audi.productionYear + ", сборка: " + audi.productionCountry);
        System.out.println("Автомобиль: " + bmw.brand + " " + bmw.model + ", объем двигателя: " + bmw.engineVolume + ", цвет: " + bmw.color + ", год выпуска: " + bmw.productionYear + ", сборка: " + bmw.productionCountry);
        System.out.println("Автомобиль: " + kia.brand + " " + kia.model + ", объем двигателя: " + kia.engineVolume + ", цвет: " + kia.color + ", год выпуска: " + kia.productionYear + ", сборка: " + kia.productionCountry);
        System.out.println("Автомобиль: " + hyundai.brand + " " + hyundai.model + ", объем двигателя: " + hyundai.engineVolume + ", цвет: " + hyundai.color + ", год выпуска: " + hyundai.productionYear + ", сборка: " + hyundai.productionCountry);
    }
}