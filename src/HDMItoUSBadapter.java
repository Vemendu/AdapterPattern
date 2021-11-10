public class HDMItoUSBadapter {
    public Cable changeCable(Cable cable)
    {
        if(cable.getType().equals("HDMI"))
        {
            cable.setType("USB");
            System.out.println("Cable HDMI converted to USB");
        }
        else if(cable.getType().equals("USB"))
        {
            cable.setType("HDMI");
            System.out.println("Cable USB converted to HDMI");

        }
        return cable;
    }
}
