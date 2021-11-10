import java.util.LinkedList;
import java.util.List;

public class USBcable implements Cable {
    public String type = "USB";
    private List<Device> deviceList = new LinkedList<>();
    public void addDevice(Device device)
    {
        deviceList.add(device);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
