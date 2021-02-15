package blackjack.model;

public enum CardType {
    DIAMOND("다이아몬드"), HEART("하트"), SPADE("스페이드"), CLOVER("클로버");

    private final String type;

    CardType(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
