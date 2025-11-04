package com.xworkz.clock.external;

import com.xworkz.clock.dto.ClockDesignDto;

public class DesignRunner {

        public static void main(String[] args) {
            ClockDesignDto designDto=new ClockDesignDto();
            designDto.setShape("round");
            String shape=designDto.getShape();
            System.out.println("clock shape"+shape);

            designDto.setDesignId(123);
            int id = designDto.getDesignId();
            System.out.println("clock design id :"+id);

            designDto.setDesignSerial(5677888);
            long serial = designDto.getDesignId();
            System.out.println("Design serial :"+serial);

            designDto.setThickness(2.1f);
            float thickness = designDto.getThickness();
            System.out.println("clock design thickness :"+thickness);

            designDto.setWeight(23.12);
            double weight=designDto.getWeight();
            System.out.println("clock design weight :"+weight);

            designDto.setDesignGrade('A');
            char garde=designDto.getDesignGrade();
            System.out.println("Design garde :"+garde);

        }
    }


