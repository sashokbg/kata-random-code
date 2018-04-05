package fr.ddf.codegenerator;

import com.pholser.junit.quickcheck.Property;
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

    @Test
    public void should_generate_code_betwean_0_and_9(){
        //given
        CodeGenerator codeGenerator = new CodeGenerator();

        //when
        int code = codeGenerator.generateCode();

        //then
        assertThat(code).isBetween(0, 9);
    }

    @Property(trials = 10)
    public void generated_codes_should_not_repeat(){

        //when
        int generatedCode = codeGenerator.generateCode();

        //then
        assertThat(alreadyGeneratedCodes).doesNotContain(generatedCode);

        alreadyGeneratedCodes.add(generatedCode);
    }
}
