package me.whiteship.refactoring._23_refused_bequest;

// Employee의 상속 클래스는 Engineer / SalesMan이 있음.
// Engineer에게 Quota라는 필드는 적절하지 않다.
// Quota라는 필드는 SalesMan에만 적절하기 때문에 Enginner는 Employee를 상속받으면, Quota 필드에 대해서는 사실상 상속포기를 한다.
// 상속포기는 불분명한 냄새를 풍기기 때문에 공통 속성만 상위에 남기고, 필요한 것들은 하위로 옮겨준다.
public class Employee {

    protected Quota quota;
    protected Quota getQuota() {
        return new Quota();
    }
}
