package io.falcon.assignment;

import io.falcon.assignment.model.Payload;
import io.falcon.assignment.service.PayloadService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ApplicationTests {

    List<Payload> payloads = null;
    Payload payload = mock(Payload.class);



    @Test
    public void testGetPalindromeLength(){
        PayloadService service = new PayloadService();
        when(payload.getContent()).thenReturn("ababab");
        assertEquals(5, service.getPalindromeLength(payload));
    }
}
