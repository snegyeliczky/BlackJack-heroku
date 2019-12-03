import com.codecool.homenetwork.device.deviceCategories.ScreanSize;
import com.codecool.homenetwork.device.deviceCategories.haveScreenDeviceTypes.Smart;

public class main {

    public static void main(String[] args) {
        Smart tv = new Smart(2,100, ScreanSize.EDTV);
        System.out.println(tv.getScreanSize().getName());
    }
}
