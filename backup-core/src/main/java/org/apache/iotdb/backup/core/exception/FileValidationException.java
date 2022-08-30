package org.apache.iotdb.backup.core.exception;

public class FileValidationException extends Exception{
    private static final long serialVersionUID = -1L;

    public FileValidationException(String message){
        super(message);
    }
}
