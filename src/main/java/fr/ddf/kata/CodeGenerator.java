package fr.ddf.kata;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CodeGenerator {
    private Set<Integer> generatedCodes = new HashSet<>();

    public int generate(int length) {
        Random random = new Random();

        int code;

        int lowerBound = (int) Math.pow(10, length - 1);
        int upperBound = (int) Math.pow(10, length);

        if(length == 1){
            lowerBound = 0;
        }

        do{
            code = random.nextInt(upperBound - lowerBound) + lowerBound;
        } while(generatedCodes.contains(code));

        generatedCodes.add(code);

        return code;
    }
}
