package blackjack;

import java.util.Stack;

public interface ShuffleStrategy {
    void shuffle(Stack<Card> cards);
}