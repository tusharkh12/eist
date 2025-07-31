package de.tum.in.ase.eist;

import java.io.BufferedReader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Files;

public final class ExamSystem {
  // private  Hashing hashing;

    private ExamSystem() {


    }

    // TODO 5: Change signature, make use of the bridge pattern
    public static String hashFile(String text, Hashing hashing) {
        return hashing.hashDocument(text);
    }

    public static void main(String[] args) {
        String file1 = readFile("exams/short_exam.txt");
        String file2 = readFile("exams/long_exam.txt");
        // TODO 6: Change SimpleHash to PreviewHashing
        PreviewHashing previewHashing = new PreviewHashing();

        System.out.println(hashFile(file1, previewHashing));
        try {
            System.out.println(hashFile(file2, previewHashing));
            throw new IllegalStateException("Hashing this file with preview hashing should not work!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        // TODO 6: Change CryptoSecureHashAlgorithm to EnterpriseHashing
        EnterpriseHashing enterpriseHashing = new EnterpriseHashing();

        System.out.println(hashFile(file1, enterpriseHashing));
        System.out.println(hashFile(file2, enterpriseHashing));
    }

    public static String readFile(String filepath) {
        Path path = Path.of(filepath);


        try {

            BufferedReader objReader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            String strCurrentLine = objReader.readLine();
            String line;
            while ((line = objReader.readLine()) != null) {
                strCurrentLine = strCurrentLine + "\n" + line;
            }
            objReader.close();
            return strCurrentLine;

        } catch (RuntimeException e) {
            return "We could not find the file ";
        } catch (IOException e) {

            e.printStackTrace();

        }


        // TODO 4: Return the content of the passed file as a String.
        return filepath;
    }

}
