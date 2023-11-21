package Homework.OnlineStore.Storage;

import Homework.OnlineStore.model.Order;
import Homework.OnlineStore.model.OrderStatus;
import Homework.OnlineStore.model.Product;

import java.util.LinkedList;

public class OrderStorage {
    private final LinkedList<Order> orderLinkedList = new LinkedList<>();

    public void addOrder(Order order) {
        orderLinkedList.add(order);
    }

    public void printOnlineOrders(Object onlineUser) {
        for (Order order : orderLinkedList) {
            if (order.getUser().equals(onlineUser)) {
                System.out.println(order);
            }
        }
    }

    public void printOrders() {
        if (empty()) {
            for (Order order : orderLinkedList) {
                System.out.println(order);
            }
        }
    }

    public boolean empty() {
        orderLinkedList.isEmpty();
        return true;
    }


    public Product changeOrderStatus(String id) {
        for (Order order : orderLinkedList) {
            if (order.getId().equals(id)) {
                order.setOrderStatus(OrderStatus.DELIVERED);
                order.getProduct().setCount(order.getProduct().getCount() - order.getCount());
                if (order.getProduct().getCount() == 0) {
                    return order.getProduct();
                }
            }
        }
        return null;
    }
    public void cancelOrderById(String orderId) {
        boolean exist = false;
        for (Order order : orderLinkedList) {
            if (order.getId().equals(orderId)) {
                order.setOrderStatus(OrderStatus.CANCELED);
                exist = true;
                System.out.println("Order canceled");
            }
        }
        if (!exist) {
            System.out.println(orderId + " this id dose not found");
        }
    }
}
