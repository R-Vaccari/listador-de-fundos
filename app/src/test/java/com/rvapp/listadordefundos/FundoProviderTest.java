package com.rvapp.listadordefundos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rvapp.listadordefundos.model.entities.Fundo;

import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FundoProviderTest {
    ObjectMapper objectMapper = new ObjectMapper();
    List<Fundo> fundos = objectMapper.readValue(new URL("https://s3.amazonaws.com/orama-media/json/fund_detail_full.json?serializ%20er=fund_detail_full"), new TypeReference<List<Fundo>>() {
        @Override
        public Type getType() {
            return super.getType();
        }
    });

    public FundoProviderTest() throws IOException {
    }

    @Test
    public void assertListNotNull() {
        assertNotNull(fundos);
    }

    @Test
    public void assertListSize() {
        assertEquals(524, fundos.size());
    }

    @Test
    public void assertFirstEquals() {
        assertEquals(1013, fundos.get(0).getId());
    }

    @Test
    public void assertEmptyAudiosAndVideos() {
        assertEquals(0, fundos.get(0).getPerformanceAudios().length);
        assertEquals(0, fundos.get(0).getPerformanceVideos().length);
    }

    @Test
    public void assertSuitabilityEquals() {
        assertEquals("Conservador", fundos.get(0).getSpecification().getFundSuitabilityProfile().getName());
    }

    @Test
    public void assertLastEquals() {
        assertEquals(1075, fundos.get(fundos.size() - 1).getId());
    }
}