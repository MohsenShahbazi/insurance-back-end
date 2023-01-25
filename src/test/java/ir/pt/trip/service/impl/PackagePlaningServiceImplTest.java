package ir.pt.trip.service.impl;


import ir.pt.trip.model.packagePlaning.PackagePlaningAddModel;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Ahangari on 04/08/2019.
 */
public class PackagePlaningServiceImplTest {

    @Test
    public void generatePackage() {
        PackagePlaningServiceImpl service = new PackagePlaningServiceImpl();
        PackagePlaningAddModel model = new PackagePlaningAddModel();
        model.setFromDate(new Date(1553110200000L));
        model.setToDate(new Date(1553887800000L));
        model.setStayingTimeDay(1);
        model.setStayingTimeNight(0);

        //service.generatePackage(model);
    }

}