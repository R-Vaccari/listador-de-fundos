package com.rvapp.listadordefundos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rvapp.listadordefundos.entidades.Fundo;

import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FundoProviderTest {

    @Test
    public void testGETRequest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Fundo> fundos = objectMapper.readValue(new URL("https://s3.amazonaws.com/orama-media/json/fund_detail_full.json?serializ%20er=fund_detail_full"), new TypeReference<List<Fundo>>() {
            @Override
            public Type getType() {
                return super.getType();
            }
        });
        assertNotNull(fundos);
        assertEquals(1013, fundos.get(0).getId());
    }

}