package org.apache.iotdb.backup.core.pipeline;

/**
 *
 * @param <T>
 */

public interface Component<T> {
    T execute();
}
