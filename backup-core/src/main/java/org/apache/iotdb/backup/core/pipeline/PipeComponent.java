package org.apache.iotdb.backup.core.pipeline;


import lombok.Data;

@Data
public abstract class PipeComponent<F,V> implements Component{

    private Component next;

    public V doNext(){
        return (V) next.execute();
    }
}
