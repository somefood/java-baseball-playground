package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String str1 = "1,2";
        assertThat(str1.split(",")).contains("1", "2");
        String str2 = "1";
        assertThat(str2.split(",")).containsExactly("1");
    }

    @Test
    void subString() {
        String str = "(1,2)";
        assertThat(str.substring(1, 4)).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 범위 테스트")
    void charAt() {
        String str = "abc";
        assertThat(str.charAt(1)).isEqualTo('b');
        assertThatThrownBy(() -> {
            str.charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("index out of range: 4");
    }
}
