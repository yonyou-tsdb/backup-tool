package org.apache.iotdb.backup.core.pipeline.context.model;

import lombok.Data;

@Data
public class ImportModel extends IECommonModel{

    private String fileName;

}
