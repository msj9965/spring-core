package hello.core.order;

import hello.core.member.Grade;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
