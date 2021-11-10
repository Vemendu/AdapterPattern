public class Laptop implements Device{
    Cable cable;
    public void attachCable(Cable cable)
    {
        if(cable.getType().equals("HDMI"))
            System.out.println("Cable attachment to Laptop failed");
        else if(cable.getType().equals("USB"))
        {
            System.out.println("Cable has been attached to Laptop");
            this.cable = cable;
            cable.addDevice(this);
        }
    }
}
