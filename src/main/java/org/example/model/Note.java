package org.example.model;

import java.util.Date;
import java.util.List;

public class Note {
    private FileOperation fileOperation;

    public Note(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }
    public void Write(String line){
        List<String> lines = Read();
        lines.add((new Date()).toString() + ' ');
        lines.add(line);
        fileOperation.saveAllLines(lines);
    }
    public List<String> Read(){
        return fileOperation.readAllLines();
    }

}
