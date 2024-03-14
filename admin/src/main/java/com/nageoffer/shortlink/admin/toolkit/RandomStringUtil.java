package com.nageoffer.shortlink.admin.toolkit;

import java.util.Random;

public final class RandomStringUtil {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LENGTH = 6;

    /**
     * 随机6位分组ID
     * @return
     */
    public static String generateRandomString() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(LENGTH);

        for (int i = 0; i < LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String randomString = RandomStringUtil.generateRandomString();
        System.out.println("Random String: " + randomString);
    }
}
