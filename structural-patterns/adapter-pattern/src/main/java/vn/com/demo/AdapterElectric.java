package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 14/11/2025
 */
public class AdapterElectric implements LedInterface {
    VietnamPower power;

    public AdapterElectric(VietnamPower power) {
        this.power = power;
    }

    @Override
    public int connect() {
        int electric = this.downElectric(this.power.getElectric());

        // Hiệu điện thế lớn hơn 3v bóng đèn sẽ cháy.
        if (electric > 3)
            return -1;
        //Hiệu điện thế bằng 3v bóng đèn phát sáng.
        if (electric == 3)
            return 1;
        // Đén không phát sáng.
        return 0;
    }

    private int downElectric(int electric) {
        return electric - 217;
    }
}
