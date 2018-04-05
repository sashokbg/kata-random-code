package fr.ddf.kata;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(JUnitQuickcheck.class)
public class CodeGeneratorTest {
    private CodeGenerator codeGenerator;



    @Test
    public void should_generate_10_unique_codes(){
        //given
        generator();

        Set<Integer> codes = new HashSet<>();

        //when
        for(int i = 0; i < 10 ; i ++){
            int generatedCode = codeGenerator.generate(1);
            codes.add(generatedCode);
        }

        //then
        assertThat(codes).hasSize(10);
    }

    @Test
    public void should_generate_code_between_0_and_9(){
        //given
        generator();

        //when
        int generatedCode = codeGenerator.generate(1);

        //then
        assertThat(generatedCode).isBetween(0,9);
    }


    @Property(trials = 50)
    public void generated_code_should_have_desired_length(@InRange(min = "1", max = "5") int length){

        //given
        generator();

        //when
        int code = codeGenerator.generate(3);

        //then
        assertThat(String.valueOf(code)).hasSize(3);
    }




    @Before
    public void generator() {
        codeGenerator = new CodeGenerator();
    }
}
