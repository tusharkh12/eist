package de.tum.in.ase.eist.ecommerce;

public class ECommerceFacade {
    private OrderController orderController;
    private AdvertisementController advertisementController;
    private ShippingController shippingController;

    public ECommerceFacade() {
        this.orderController = new OrderController();
        this.advertisementController = new AdvertisementController();
        this.shippingController = new ShippingController();
    }

    public void processOrder(Order order ){
        orderController.processOrder(order);
    }
    public void processOrder(Order order,String name){
        orderController.processOrder(order,name);
    }
    public Order retrieveLatestOrder(int number){
        return orderController.retrieveLatestOrder(number);

    }

    public void playAdvertisement(int age){
        advertisementController.playAdvertisement(age);
    }
    public void shipOrder(Order order,String address){
        order.setShipping(shippingController.createShipping(address));
        shippingController.shipOrder(order);
    }


}
