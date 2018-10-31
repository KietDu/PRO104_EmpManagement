/*
*Lớp ShareHelper cung cấp phương thức tiện ích quản lý người đăng nhập và làm việc với hình ảnh
* chia sẽ trong tất cả các form của ứng dụng
*/
package com.helper;

import com.model.User;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class ShareHelper {

    /**
     * Ảnh biểu tượng của ứng dụng, xuất hiện trên mọi cửa sổ
     */
    public static final Image APP_ICON;

    static {
// Tải biểu tượng ứng dụng
        String file = "/com/polypro/icon/fpt.png";
        APP_ICON = new ImageIcon(ShareHelper.class.getResource(file)).getImage();
    }

    /**
     * Sao chép file logo chuyên đề vào thư mục logo
     *
     * @param file là đối tượng file ảnh
     * @return chép được hay không
     */
    public static boolean saveLogo(File file) {
        File dir = new File("logos");
// Tạo thư mục nếu chưa tồn tại
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
// Copy vào thư mục logos (đè nếu đã tồn tại)
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    /**
     * Đọc hình ảnh logo chuyên đề
     *
     * @param fileName là tên file logo
     * @return ảnh đọc được
     */
    public static ImageIcon readLogo(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static User USER = null;

    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void logoff() {
        ShareHelper.USER = null;
    }

    /**
     * Kiểm tra xem đăng nhập hay chưa
     *
     * @return đăng nhập hay chưa
     */
    public static boolean authenticated() {
        return ShareHelper.USER != null;
    }

    public static String numberFormatFloat(Double numFormat) {
        DecimalFormat dc = new DecimalFormat("0.0");
        String formattedFloat = dc.format(numFormat);
        return formattedFloat;
    }
}
