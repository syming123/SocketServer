package ServerCore;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;

public class MessageProcess
{
    //process message
    public static String process(String ipt)
    {
        //example for String
        return "echo:"+ipt;


        //example for json
        /*JSONObject json = JSON.parseObject(ipt);

        return json.toString();*/
    }

    //return true for stop(unlink)
    public static boolean ifStop(String ipt)
    {
        //example for String
        if (ipt.equals("stop"))
        {
            return true;
        }
        else
        {
            return false;
        }


        //example for json
        /*JSONObject json = JSON.parseObject(ipt);
        if(json.getIntValue("statue") == 1)
        {
            return true;
        }
        else
        {
            return false;
        }*/

    }
}
