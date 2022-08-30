package org.apache.iotdb.backup.core.exception;

public class ParamCheckException extends Exception{
    private static final long serialVersionUID = -1L;

    public ParamCheckException(String message){
        super(message);
    }
}
