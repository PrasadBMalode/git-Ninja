package com.xworkz.physics.external;

import com.xworkz.physics.internal.Physics;

public class Runner {
    public static void main(String[] args) {
        Physics physics=new Physics();
        physics.cost(3999);

        physics.book(true);

        physics.name("physics");

        physics.version(false);

        physics.updated(true);
    }
}
