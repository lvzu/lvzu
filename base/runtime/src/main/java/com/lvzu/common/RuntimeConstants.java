package com.lvzu.common;

/**
 * Created with IntelliJ IDEA.
 * User: Lipeng
 * Date: 13-9-17
 * Time: 下午10:58
 * To change this template use File | Settings | File Templates.
 */
public class RuntimeConstants {
    /*
    状态可用
     */
    public static final int STATUS_VALID = 1;
    /*
    状态不可用
     */
    public static final int STATUS_NOTVALID = 0;
    /*
      逻辑删除标志位
     */
    public static final int DELETE_LOGIC = 0;

    /*
      物理删除标志位
     */
    public static final int DELETE_PHYSIC = 1;

    /*
      操作成功返回标识
     */
    public static final int OPERATE_SUCCESS = 1;

    /*
     操作失败返回标识
    */
    public static final int OPERATE_FAIL = 0;

}
