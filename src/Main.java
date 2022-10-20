import transport.car;

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
        car hyundai = new car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        audi.setGears("автомат");
        bmw.setSummerTyres(false);

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);
    }

    public static void printInfo(car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", год выпуска: " + car.getProductionYear() +
                        ", страна сборки: " + car.getProductionCountry() +
                        ", цвет кузова: " + car.getColor() +
                        ", объем двигателя: " + car.getEngineVolume() +
                        ", коробка передач: " + car.getGears() +
                        ", тип кузова: " + car.getTypeOfBody() +
                        ", рег номер: " + car.getRegNumber() +
                        ", кол-во мест: " + car.getSeatsCount() +
                        " " + (car.isSummerTyres() ? "летняя" : "зимняя") + " резина, "
                        + (car.getKey().isWithoutKeyAccess() ? " бесключевой доступ" : "ключевой доступ") + ", " +
                        (car.getKey().isRemoteRunEngine() ? " удаленный запуск" : "обычный запуск") +
                        ", номер страховки: " + car.getInsurance().getNumber() +
                        ", стоимость страховки: " + car.getInsurance().getCost() +
                        ", срок действия: " + car.getInsurance().getExpireDate()

        );
    }
}