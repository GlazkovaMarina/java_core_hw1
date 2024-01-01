package org.example;

import org.example.model.FileOperation;
import org.example.model.FileOperationImpl;
import org.example.model.Note;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //        System.out.printf("Hello and welcome!");

        FileOperation fileOperation = new FileOperationImpl("note1.txt");
        Note note1 = new Note(fileOperation);
        note1.Write("Hello World!");
        note1.Write("Hello World2!");
        System.out.println(note1.Read());


    }
}