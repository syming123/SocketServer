package ServerCore;

import com.alibaba.fastjson.JSONObject;


public class KeyData
{
    private static int port = 8888;

    public static int getPORT() {
        return port;
    }
    public static void setPORT(int PORT) {
        port = PORT;
    }
}
