package com.nd.argoshka;

import android.util.JsonReader;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.util.zip.ZipInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import android.util.JsonReader;
import android.util.Log;
import android.widget.TabHost;

import java.io.InputStream;
import java.io.InputStreamReader;


public class ResponseParser {
    public static final String TAG = ResponseParser.class.getSimpleName();

    public void parse(InputStream stream)
            throws IllegalAccessException, InstantiationException, IOException {


        try {
            File file = new File("D:/3/DictionariesResponseDownloadZipFile.zip");
            FileInputStream fis = new FileInputStream(file);
            ZipInputStream zipIn = new ZipInputStream(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }


    }





        InputStream inputStream = stream;

        InputStreamReader isr =  new InputStreamReader(inputStream, "UTF-8");
        char[] buffer = new char[1024];
        isr.read(buffer,0,1000);
        buffer.toString();

        try {
            long startTime = System.currentTimeMillis();
            readTables(reader);


        } finally {
            reader.close();
        }
    }

/**
 * Created by ND on 5/16/2016.
 */
public class test {



    public class UnzipUtility {
        private static final int BUFFER_SIZE = 4096;

        public void unzip(String zipFilePath) throws IOException {

            File file = new File("D:/3/DictionariesResponseDownloadZipFile.zip");
            ZipInputStream zipIn = new ZipInputStream(new FileInputStream(file));
            zipIn.available();
            ZipEntry entry = zipIn.getNextEntry();
            String a =  String.valueOf(entry.getSize());
            JsonElement jelement;
            jelement = new JsonParser().parse(entry);

            zipIn.closeEntry();
            zipIn.close();
            StringBuilder sb = new StringBuilder();
            sb.append("asdfas",10,20);
            sb.toString()

        }


    }

    UnzipUtility unzipUtility = new UnzipUtility();
    unzipUtility.unzip("D:\\3\\DictionariesResponseDownloadZipFile.zip");


}
