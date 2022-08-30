package org.apache.iotdb.backup.core.pipeline.context.model;

import lombok.Data;

import java.util.List;

@Data
public class ExportModel extends IECommonModel{

    private String iotdbPath;

    private String whereClause;

    private List<String> measurementList;
}
