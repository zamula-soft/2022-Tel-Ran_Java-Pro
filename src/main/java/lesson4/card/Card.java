package lesson4.card;

public class Card {
    private String holder;
    private double balance;
    private CardStatus status;

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public CardStatus getStatus() {
        return status;
    }

    public enum CardStatus{
        ORDERED(5){
            public boolean isOrdered(){
                return true;
            }
        },
        READY(2) {
            @Override
            public boolean isReady(){
                return true;
            }
        },
        DELIVERED(0) {
            @Override
            public boolean isDelivered(){
                return true;
            }
        };

        private int timeToDelivery;

        public int getTimeToDelivery() {return timeToDelivery;}

        public boolean isOrdered(){return false;}

        public boolean isDelivered(){return false;}

        public boolean isReady(){return false;}

        CardStatus(int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }


    }

    public boolean isDeliverable()
    {
        return status.isReady();
    }

}
