public class car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        this.productionYear = productionYear;
        if (productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }
}
