package rentcar;

public abstract class Car implements Report {
    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    double getChargeQuantity() {
        double uncleanChargeQuantity = getTripDistance() / getDistancePerLiter();
        double cleanChargeQuantity = Math.round(uncleanChargeQuantity * 100) / 100.0;
        return cleanChargeQuantity;
    }
}
