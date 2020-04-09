package com.company.homework.ioStream;

import java.io.*;

public class ReadingUser {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void read() throws IOException {
        System.out.println("pls enter name");
        String name = reader.readLine();
        try (InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\svato\\" +
                "IdeaProjects\\course2\\" + name + ".txt"))) {
            while (bufferedInputStream.available() > 0) {
                char ch = (char) bufferedInputStream.read();
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
