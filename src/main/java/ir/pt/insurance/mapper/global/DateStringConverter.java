//package ir.pt.insurance.mapper.global;
//
//
//import java.util.Date;
//
///**
// * Created by MMT on 12/23/2015.
// */
//public class DateStringConverter {
//    public String dateToString(Date date) {
//        if (date != null)
//            return String.valueOf(date.getTime()).trim();
//        else return "";
//    }
//
//    public Date stringToDate(String longValue) {
//        if (longValue == null)
//            return null;
//        else if (longValue != "" && longValue.length() == 14 && !longValue.isEmpty())
//            return new Date(longValue); // Utils.convertPersianToGregorian(longValue);
//        else
//            return null;
//    }
//
//    public Boolean byteToBoolean(Byte aByte) {
//        if (aByte == null)
//            return null;
//        else {
//            if (aByte == 1)
//                return true;
//            else return false;
//        }
//    }
//
//    public Byte byteToBoolean(Boolean aBoolean) {
//        if (aBoolean == null)
//            return null;
//        else {
//            if (aBoolean)
//                return 1;
//            else return 0;
//        }
//
//    }
//}
