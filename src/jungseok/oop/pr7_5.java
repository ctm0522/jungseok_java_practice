package jungseok.oop;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private static int oldChannel; // 정적 변수 (딱 하나만 존재함)

    final int MAX_VOLUME = 100; // 재할당 금지 (상수)
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // getter setter 추가
    public boolean isPowerOn() {
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public static int getOldChannel() {
        return oldChannel;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setChannel(int channel) { // 매개변수가 계속 바뀜
        oldChannel = this.channel; // 세터로 바뀌기전 객체의 상태를 가져옴
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // gotoPrevChannel 메서드
    void gotoPrevChannel() {
        this.setChannel(oldChannel);
    }

    public static void setOldChannel(int oldChannel) {
        MyTv2.oldChannel = oldChannel;
    }
}


public class pr7_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+ t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+ t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+ t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+ t.getChannel());
    }
}
