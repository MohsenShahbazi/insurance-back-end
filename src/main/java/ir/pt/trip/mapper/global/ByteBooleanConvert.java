package ir.pt.trip.mapper.global;

/**
 * Created by ADMIN on 23/12/2015.
 */
public class ByteBooleanConvert {

    public Boolean byteToBoolean(Byte aByte) {
        if (aByte == null)
            return null;
        else {
            if (aByte == 1)
                return true;
            else return false;
        }

    }

    public Byte byteToBoolean(Boolean aBoolean) {
        if (aBoolean == null)
            return null;
        else {
            if (aBoolean)
                return 1;
            else return 0;
        }

    }


}
