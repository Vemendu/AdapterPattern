public class Main {
    public static void main(String[] args) {
        Device monitor = new Monitor();
        Device laptop = new Laptop();
        Cable usbCable = new USBcable();
        laptop.attachCable(usbCable);
        HDMItoUSBadapter adapter = new HDMItoUSBadapter();
        monitor.attachCable(adapter.changeCable(usbCable));
    }
}
