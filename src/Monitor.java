public class Monitor implements Device{
    Cable cable;
    public void attachCable(Cable cable)
    {
        if(cable.getType().equals("USB"))
            System.out.println("Cable attachment to Monitor failed");
        else
        {
            System.out.println("Cable has been attached to a Monitor");
            this.cable = cable;
            cable.addDevice(this);
        }
    }
}
