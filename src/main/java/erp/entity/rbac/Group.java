package erp.entity.rbac;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Yhaobo
 * @date 2021-03-04 10:48
 */
@Data
@TableName(value = "rbac_group")
public class Group {
    @TableId(type = IdType.AUTO)
    private String id;
    private String name;
    private String description;
}

