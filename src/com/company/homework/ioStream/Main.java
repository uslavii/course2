package com.company.homework.ioStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        RecordUser recordUser = new RecordUser();
        recordUser.write();
        ReadingUser readingUser = new ReadingUser();
        readingUser.read();
    }

}
