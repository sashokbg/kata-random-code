package fr.ddf.codegenerator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CodeGenerator {
    private Random random = new Random();
    private Set<Integer> generatedCodes = new HashSet<>();

    public int generateCode(int length) {
        int randomNumber;

        int lowerBound = (int) Math.pow(10, length-1);
        int upperBound = (int) Math.pow(10, length);

        do {
            randomNumber = random.nextInt(upperBound - lowerBound) + lowerBound;
        } while(generatedCodes.contains(randomNumber));

        generatedCodes.add(randomNumber);

        return randomNumber;
    }
}
