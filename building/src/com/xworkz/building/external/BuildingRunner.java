package com.xworkz.building.external;

import com.xworkz.building.internal.Building;
import com.xworkz.building.internal.Colony;
import com.xworkz.building.internal.Floores;

public class BuildingRunner {
    public static void main(String[] args) {
        Floores floores=new Floores(23);
        Building building=new Colony("KVG",6,floores);
        building.displayBuilding();
    }
}
