package org.apache.iotdb.backup.core.pipeline;

import reactor.core.Disposable;

import java.io.IOException;

/**
 *
 */
public interface Pipeline {

    Disposable start() throws IOException;

    void shutDown();

}
