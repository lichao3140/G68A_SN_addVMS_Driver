package com.runvision.core;

import android.os.Environment;

/**
 * Created by Administrator on 2018/6/5.
 */

public class Const {
    /**
     * 实际相机显示的大小
     */
    public static int Panel_width = 0;
    /**
     * 1：N当前失败次数
     */
    public static int ONE_VS_MORE_TIMEOUT_NUM = 0;
    /**
     * 1:N允许最大失败次数
     */
    public static int ONE_VS_MORE_TIMEOUT_MAXNUM = 5;

    /**
     * 人脸模版所有 在第一次加载到这里面来
     */
    // public static Map<String, byte[]> mTemplateMap = new HashMap<String, byte[]>();
    public static int CARD_WIDTH = 102;//身份证图片的宽度

    public static int CARD_HEIGTH = 126;//身份证图片的高度

    public static int COMPER_NUM = 10;

    public static float ONEVSMORE_SCORE = 0.60f;//1：N阈值

    public static float ONEVSONE_SCORE = 0.40f;//1：1阈值

    /**
     * 是否注册人脸标志位
     */
    public static boolean is_regFace = false;

    //注册抓拍人脸
    public static final int REG_FACE = 16;
    // 人证比对完成
    public final static int FLAG_CLEAN = 220;

    /**
     * 相机流的高
     */
    public static final int PRE_HEIGTH = 480;

    /**
     * 相机流的宽
     */
    public static final int PRE_WIDTH = 640;

    public static final String APP_ID = "J3Yscp63XC1M1ut6Fk6DguTeTqKPKJZRZ3BukyHnuE5E";
    public static final String SDK_KEY = "DMco6iZeeVhdeXJKQUENi5KAa64f5SYCgzyVDSELc1dv";

    //记录人脸定位算法是否成功
    public static boolean afdInit = false;

    public static final int PROMPT = 1000;
    public static final int COMPER_END = 1001;
    public static final int TEST_INFRA_RED = 1002;
    public static final int FLAG_SHOW_LOG = 1003;
    public static final int READ_CARD = 1004;
    public static final int UPDATE_UI = 1005;
    public static final int COMPER_FINIASH = 1006;
    public static final int MSG_FACE = 1007;
    public static final int MSG_READ_CARD = 1008;
    public static final int READ_CARD_INFO = 1009;
    public static final int SELECTED_COURSE = 1010;

    //socket连接超时
    public static final int SOCKET_TIMEOUT = 10;
    public static final int SOCKET_DIDCONNECT = 11;

    //socket接收模版完成
    public static final int SOCKRT_SENDIMAGE = 12;

    // public static final int WEB_UPDATE = 13;

    //socket协议发送消息类型
    //通信协议版本号
    public final static int SOCKET_VERSION = 0x02000000;
    //设备登录
    public final static int NMSG_CNT_DEVLOGIN = 0x00000101;
    //心跳
    public final static int NMSG_DCHNL_STATUS = 0x10020502;
    //上传数据
    public final static int NMSG_FACE_CMPRESULT = 0x00020300;
    //修改设置参数
    public final static int NMSG_DCHNL_SET = 0x10020200;
    //收到模版
    public final static int NMSG_FLIB_ADD = 0x00010100;
    //下发模板错误信息
    public final static int NMSG_ERROR_MSG = 0x00010802;

    public final static char TYPE_CARD = 0x01;
    public final static char TYPE_ONEVSMORE = 0x02;

    public static final int SOCKET_LOGIN = 9;

    /**
     * 抓拍图片保存未知
     */
    public static final String SNAP_DIR = "Snap";
    /**
     * 身份证照片保存位置
     */
    public static final String CARD_DIR = "Card";

    public static final String TEMP_DIR = "FaceTemplate";

    public static final String MOBILE_SAFE_PSD = "666666";
    /**
     * SharedPreferences 的 KEY
     */
    public static final String KEY_ONEVSMORESCORE = "oneVsMoreScore";
    public static final String KEY_CARDSCORE = "cardScore";
    public static final String KEY_ISOPENLIVE = "isOpenLive";
    public static final String KEY_ISOPENMUSIC = "isOpenMusic";
    public static final String KEY_BACKHOME = "backHome";
    public static final String KEY_OPENDOOR = "openDoor";
    public static final String KEY_VMSIP = "vmsIP";
    public static final String KEY_VMSPROT = "vmsProt";
    public static final String KEY_VMSUSERNAME = "vmsUserName";
    public static final String KEY_VMSPASSWORD = "vmsPassWord";
    public static final String ATD_UP_STARTIME = "atd_up_startime";
    public static final String ATD_UP_ENDTIME = "atd_up_endtime";
    public static final String ATD_DOWN_STARTIME = "atd_down_startime";
    public static final String ATD_DOWN_ENDTIME = "atd_down_endtime";
    public static final String KEY_PRESERVATION_DAY = "preservation_day";

    public static String DEV_INSCODE = "inscode";
    public static String PRIVATE_KEY = "privateKey";
    public static String DEV_NUM = "devnum";
    public static String DEV_GPS = "gps";
    public static String SELECT_COURSE_NAME = "select_course_name";
    public static String TIME_SIGN_BEGIN = "time_sign_begin";
    public static String TIME_SIGN_END = "time_sign_end";
    public static String TIME_SIGN_OUT_BEGIN = "time_sign_out_begin";
    public static String TIME_SIGN_OUT_END = "time_sign_out_end";

    /**
     * 默认开启活体
     */
    public static final boolean OPEN_LIVE = true;

    /**
     * 默认开启语音
     */
    public static final boolean OPEN_MUSIC = true;

    /**
     * 30S无操作  返回待机页面  相机休眠
     */
    public static final int CLOSE_HOME_TIMEOUT = 30;

    public static final int CLOSE_DOOR_TIME = 1;

    public static Boolean BATCH_IMPORT_TEMPLATE = false;
    public static Boolean VMS_BATCH_IMPORT_TEMPLATE = false;
    public static Boolean VMS_TEMPLATE = false;
    public static int VMS_ERROR_TEMPLATE = 0;

    public static int BATCH_FLAG = 0;

    public static boolean UPDATE_IP = false;

    //public static Boolean BATCH_IMPORT_TEMPLATE=false;

    /**
     * 存储人脸图片转Data数据模板路径
     */
    public static String Templatepath = Environment.getExternalStorageDirectory() + "/FaceAndroid/Template/";

    /**
     * 存储人脸图片模板路径
     */
    public static String ImagePath = Environment.getExternalStorageDirectory() + "/FaceAndroid/FaceTemplate/";

    public static boolean WEB_UPDATE = false;
    public static boolean DELETETEMPLATE = false;

    /**
     * Apk更新路径
     */
    public static String APK_UPDATE_PATH = "https://fir.im/6g21";

    /**
     * 服务器地址
     */
    private static String SERVER_IP = "http://124.133.246.162:38071/jsxt/api/";

    /**
     * 考勤终端注册接口
     */
    public static String REGISTER =  SERVER_IP + "device?";

    /**
     * 考勤终端登录接口
     */
    public static String LOGIN = SERVER_IP + "devicelogin?";

    /**
     * 人脸验证接口
     */
    public static String FACE_WITNESS = SERVER_IP + "faceVerify?";

    /**
     * 考勤参数
     */
    public static String PARAMETER = SERVER_IP + "atndquery?";

    /**
     * 培训登录
     */
    public static String STULOGIN = SERVER_IP + "stulogin?";

    /**
     * 培训登出
     */
    public static String STULOGOUT = SERVER_IP + "stulogout?";
}
