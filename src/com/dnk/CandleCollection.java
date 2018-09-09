package com.dnk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CandleCollection {

    private List<Candle> candles = new ArrayList<>();

    public CandleCollection(String fileName) {
        Path pathFile = Paths.get(fileName);

        List<String> content = new ArrayList<>();

        try {
            content = Files.readAllLines(pathFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s :content) {
            candles.add(new Candle(s));
        }

    }

    public List<Candle> getCandles() {
        return Collections.unmodifiableList(candles);
    }
}