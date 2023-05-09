package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class OrderProcessor {

    // Order의 우선순위를 파악하는데, 문자열로 처리하고 있음.
    // 문자열로 우선순위의 랭킹을 설정하기 어려움. --> 기본형에서 객체로 변경이 필요함.
    public long numberOfHighPriorityOrders(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getPriority() == "high" || o.getPriority() == "rush")
                .count();
    }
}
