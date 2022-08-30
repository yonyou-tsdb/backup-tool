package org.apache.iotdb.backup.core.service;


import org.apache.iotdb.backup.core.exception.FileTransFormationException;
import org.apache.iotdb.backup.core.parse.FileTransParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface FileTransformationService {

    FileTransParser getParser(String path, String charset) throws Exception;

    void transToInsertFile(String path, String outPutPath);

    InputStream transToInsertStream(String path, boolean aligned, String charset) throws IOException;

    default File validateFilePath(String filePath) throws FileTransFormationException {
        File fi = new File(filePath);
        if (fi.isFile()) {

        } else if (fi.isDirectory()) {
            throw new FileTransFormationException("given path is not a file,it is a directory");
        } else {
            throw new FileTransFormationException("file can not find");
        }
        return fi;
    }
}
