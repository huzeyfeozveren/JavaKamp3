package org.example.core.logging;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Dosya loglandı : " + data);
    }
}
