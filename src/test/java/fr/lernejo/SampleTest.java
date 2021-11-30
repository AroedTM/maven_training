package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    private final Sample sample = new Sample();

    @Test
    void fact_of_negative_number_throws() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-1))
            .withMessage("N should be positive");
    }

    @Test
    void fact_of_5_is_120() {
        int result = sample.fact(5);
        Assertions.assertThat(result).isEqualTo(120); // (4)
    }

    @Test
    void op_4_add_3_is_7(){
        int r = sample.op(Sample.Operation.ADD, 4, 3);
        Assertions.assertThat(r).isEqualTo(7);
    }

    @Test
    void op_4_mult_3_is_12(){
        int r = sample.op(Sample.Operation.MULT, 4, 3);
        Assertions.assertThat(r).isEqualTo(12);
    }
}
