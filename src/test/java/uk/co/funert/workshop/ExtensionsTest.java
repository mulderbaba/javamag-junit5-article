package uk.co.funert.workshop;

import com.example.mockito.InjectMock;
import com.example.mockito.MockitoExtension;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by mertcaliskan
 */
@ExtendWith(MockitoExtension.class)
class ExtensionsTest {

    @BeforeEach
    void init(@InjectMock User user) {
        when(user.getName()).thenReturn("Mert");
    }

    @Test
    void parameterInjectionWorksOk(@InjectMock User user) {
        assertEquals("Mert", user.getName());
    }
}
