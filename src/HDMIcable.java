import java.util.LinkedList;
import java.util.List;

public class HDMIcable implements Cable {
    private List<Device> deviceList = new LinkedList<>();
    public void addDevice(Device device)
    {
        deviceList.add(device);
    }
    public String type = "HDMI";
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
