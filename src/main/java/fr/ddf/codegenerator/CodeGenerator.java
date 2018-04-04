package fr.ddf.codegenerator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CodeGenerator {
    private Random random = new Random();
    private Set<Integer> generatedCodes = new HashSet<>();

    public int generateCode() {
        int randomCode;

        do {
            randomCode = random.nextInt(10) + 1;
        } while(generatedCodes.contains(randomCode));

        generatedCodes.add(randomCode);

        return randomCode;
    }
}
