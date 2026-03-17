public class Ex3 {

    public double calculateFinalPrice(double basePrice, String clientType, boolean holiday) {
        double discount = getDiscountByClientType(clientType);

        if (holiday) {
            discount += 0.05;
        }

        double finalPrice = basePrice * (1 - discount);

        return finalPrice;
    }

    public double getDiscountByClientType(String clientType) {
        return switch (clientType) {
            case "New Client" -> 0.1;
            case "Customer" -> 0.15;
            default -> 0.0;
        };
    }
}
