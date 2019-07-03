package FilesandDirectories;

import javax.swing.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo {
    public static void main(String[] args) {


//
//        JFileChooser f = new JFileChooser();
//        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        f.showSaveDialog(null);
//
//        System.out.println(f.getCurrentDirectory());
//        System.out.println(f.getSelectedFile());
//        JOptionPane.showInputDialog(null,JFileChooser);


        //28JAN19 13:40
//        Calendar calendar = new GregorianCalendar();
//        calendar.getTime().

//        SimpleDateFormat format = new SimpleDateFormat("ddyy hh:mm");
//        System.out.println(format.format(calendar.getTime()));

        Date date1 = new Date();
        Calendar cal =  Calendar.getInstance();
        cal.setTime(date1);
        int daysToDecrement = -90;
        cal.add(Calendar.DATE, daysToDecrement);
//        date1 = cal.getTime(); // again get back your date object
        System.out.println(cal.getTime());


    }
}
