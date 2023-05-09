package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

// AlertService / EmailService는 외부에 뭔가를 전송해준다는 것에서 비슷한 일을 한다.
// 하지만 서로 다른 API를 제공(add, sendEmail)하기 때문에 대안 클래스처럼 동작하고 있다.
// 슈퍼 클래스로 추출하면 좋지만, 서드 파티라서 추출할 수 없는 경우라면 하나의 추상화 계층을 추가해서 처리할 수 있다.
public interface AlertService {
    void add(AlertMessage alertMessage);
}
