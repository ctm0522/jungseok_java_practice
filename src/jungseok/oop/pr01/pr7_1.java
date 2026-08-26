package jungseok.oop.pr01;

// 자바의 정석 기초편 연습문제 7-1

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    // 섯다 카드 배열을 초기화하는 생성자 만들기.
    SutdaDeck() {
        // 요구사항
        // 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍씩 있음 (num) -> 1부터 10까지 반복
        // 숫자가 1,3,8인 경우에는 둘중의 한장은 광이어야함(isKwang) -> 여부
        for (int i= 0; i < CARD_NUM; i++) {
            int number = i % 10 + 1; // 인덱스는 0부터 19까지 이므로
            cards[i] = new SutdaCard(number, false);
            if ( i < 10) { // 광은 카드 두장중 하나만 처리돼야함.
                if (cards[i].num == 1 || cards[i].num == 3 || cards[i].num == 8) {
                    cards[i].isKwang = true;
                }
            }
        }

    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class pr7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck(); // 섯다카드로 구성된 섯다덱 배열 객체 생성

        for (int i=0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }


    }
}
