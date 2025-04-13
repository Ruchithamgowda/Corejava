package com.xworkz.casting.GeneratorRunner;

import com.xworkz.casting.internal.Generator;
import com.xworkz.casting.internal.Inverter;

public class GeneratorRunner {
    public static void main(String[] args) {
        Generator generator = new Generator();
        generator.generate();

        Generator generator1 = new Inverter();
        generator1.generate();

        Inverter inverter2 = (Inverter) generator1;
        inverter2.backup();

        Inverter inverter = new Inverter();
        inverter.generate();
        inverter.backup();
    }
}
