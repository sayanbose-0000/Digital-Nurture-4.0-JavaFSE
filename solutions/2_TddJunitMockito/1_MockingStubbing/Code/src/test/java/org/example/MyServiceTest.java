package org.example;

import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyServiceTest {
    @Test
    public void testExternalApi() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class); // External api needs to be an interface
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        String res = service.fetchData();

        assertEquals("Mock Data", res);
    }
}
