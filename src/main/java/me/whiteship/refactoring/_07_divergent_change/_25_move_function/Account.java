package me.whiteship.refactoring._07_divergent_change._25_move_function;

public class Account {

    private int daysOverdrawn;

    private AccountType type;

    public Account(int daysOverdrawn, AccountType type) {
        this.daysOverdrawn = daysOverdrawn;
        this.type = type;
    }

    public double getBankCharge() {
        double result = 4.5;
        if (this.daysOverdrawn() > 0) {
            result += this.overdraftCharge();
        }
        return result;
    }

    private int daysOverdrawn() {
        return this.daysOverdrawn;
    }

    // type의 메서드를 참조한다. 아래의 경우는 반반이지만, 이런 경우라도 메서드 이동을 고려해볼 수 있음.
    // type으로 메서드를 옮기게 되면 daysOverdrawn 매개변수를 받아야 한다.
    // 이 때 daysOrverdrawn 매개변수를 받을지, Account 타입을 받을지를 고려해야함. Account 타입은 새로운 의존성이 생기는 것임.
    // Account -> Account Type을 참조하는데, 만약 Account Type도 Account를 참조한다면, 이것은 순환참조가 될 수 있음.
    // 따라서 daysOverDrawn 값만 넘기는 것이 좋다.
    private double overdraftCharge() {
        if (this.type.isPremium()) {
            final int baseCharge = 10;
            if (this.daysOverdrawn <= 7) {
                return baseCharge;
            } else {
                return baseCharge + (this.daysOverdrawn - 7) * 0.85;
            }
        } else {
            return this.daysOverdrawn * 1.75;
        }
    }
}
