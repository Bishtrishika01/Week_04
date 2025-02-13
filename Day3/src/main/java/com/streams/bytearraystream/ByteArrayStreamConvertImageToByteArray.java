/*5. ByteArray Stream - Convert Image to ByteArray
📌 Problem Statement:
Write a Java program that converts an image file into a byte array and then writes it back to another image file.
Requirements:
Use ByteArrayInputStream and ByteArrayOutputStream.
Verify that the new file is identical to the original image.
Handle IOException.*/
package com.streams.bytearraystream;
import java.io.*;
import java.util.Arrays;

public class ByteArrayStreamConvertImageToByteArray {
    public static void main(String[] args) {
        String inputImagePath = "src/main/java/com/streams/bytearraystream/inputimage.jpg";
        String outputImagePath = "src/main/java/com/streams/bytearraystream/writeimage.jpg";

        try {
            // Converting image to byte array using method
            byte[] imageBytes = ConvertImageToByteArray.convertImageToByteArray(inputImagePath);

            // Writing byte array back to image file
            WriteByteArrayToImage.writeByteArrayToImage(imageBytes,outputImagePath);

            //Output
            System.out.println();
            System.out.println("Image converted successfully");
            System.out.println("Image written successfully");
            System.out.println("Check output image file -> " + outputImagePath);

            //Creating byte array for output image
            byte[] imageBytes2 = ConvertImageToByteArray.convertImageToByteArray(outputImagePath);
            if(Arrays.equals(imageBytes,imageBytes2) ){
                System.out.println("Both images are identical");
            }
            else{
                System.out.println("Both images are not identical");
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
