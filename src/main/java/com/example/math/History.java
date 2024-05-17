package com.example.math;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class History {
    private List<String> history;

    public History() {
        history = new ArrayList<>();
    }

    public void addEntry(String entry) {
        history.add(entry);
    }

    public void saveToFile() {
        String userHome = System.getProperty("user.home");
        String filePath = Paths.get(userHome, "Desktop", "history.log").toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String entry : history) {
                writer.write(entry);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}