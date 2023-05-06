package me.whiteship.refactoring._17_message_chain._37_hide_delegate.after;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void manager() {
        Person keesun = new Person("keesun");
        Person nick = new Person("nick");
        keesun.setDepartment(new Department("m365deploy", nick));

        // 테스트 코드 수정
        // Person manager = keesun.getDepartment().getManager();
        Person manager = keesun.getManager();
        assertEquals(nick, manager);
    }

}