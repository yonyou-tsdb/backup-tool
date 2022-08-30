package org.apache.iotdb.backup.core.pipeline.context.model;

import lombok.Data;
import org.apache.iotdb.session.Session;

import java.util.List;

/**
 * @Author: LL
 * @Description:
 * @Date: create in 2022/7/26 13:51
 */
@Data
public class DeleteModel extends PipelineModel {

    private Session session;

    private String iotdbPath;

    private String whereClause;

    private List<String> measurementList;

}
