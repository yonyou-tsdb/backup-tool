package org.apache.iotdb.backup.core.pipeline.context;

import org.apache.iotdb.backup.core.pipeline.context.model.PipelineModel;
import lombok.Data;

@Data
public class PipelineContext<R extends PipelineModel> {

    private String name = "pipeline-context";

    private R model;

}
