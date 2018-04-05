package fr.ddf.codegenerator;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitQuickcheck.class)
public class CodeGeneratorTest {
    private static Set<Integer> alreadyGeneratedCodes = new HashSet<>();
    private static CodeGenerator codeGenerator;

    @BeforeClass
    public static void onlyOnce() {
        codeGenerator = new CodeGenerator();
    }

    @Property
    public void generate_code_should_be_betwean_0_and_9(){
        //given
        CodeGenerator codeGenerator = new CodeGenerator();

        //when
        int code = codeGenerator.generateCode(1);

        //then
        assertThat(code).isBetween(0, 9);
    }

    @Property(trials = 10)
    public void generated_codes_should_not_repeat(){
        codeGenerator = new CodeGenerator();
        alreadyGeneratedCodes = new HashSet<>();

        //when
        int generatedCode = codeGenerator.generateCode(1);

        //then
        assertThat(alreadyGeneratedCodes).doesNotContain(generatedCode);

        alreadyGeneratedCodes.add(generatedCode);
    }

    @Property(trials = 50)
    public void generated_code_should_have_desired_length(@InRange(min = "1", max = "5") int length){
        codeGenerator = new CodeGenerator();
        alreadyGeneratedCodes = new HashSet<>();

        int generatedCode = codeGenerator.generateCode(length);

        assertThat(String.valueOf(generatedCode)).hasSize(length);
    }

    @Test
    public void should_generate_all_numbers_between_0_and_10(){
        CodeGenerator codeGenerator = new CodeGenerator();
        alreadyGeneratedCodes = new HashSet<>();

        for(int i = 0; i < 500; i++){
            int generatedCode = codeGenerator.generateCode(1);
            alreadyGeneratedCodes.add(generatedCode);
        }

        assertThat(alreadyGeneratedCodes).containsExactly(0,1,2,3,4,5,6,7,8,9);
    }
}
