package com.xworkz.mobile.external;

import com.xworkz.mobile.internal.CameraMP;
import com.xworkz.mobile.internal.PoorvaShop;
import com.xworkz.mobile.internal.Realme;

public class RealmeRunner {
    public static void main(String[] args) {

        CameraMP cameraMP=new CameraMP(60);
        Realme realme=new PoorvaShop("Realme Xt",128,22.999,cameraMP);
        realme.displayRealme();

    }
}
