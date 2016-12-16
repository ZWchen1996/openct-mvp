package cc.metapro.openct.utils;

import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by jeffrey on 11/30/16.
 */

public final class Constants {

    // encryption seed
    public final static String seed = "MIIEpAIBAAKCAQEAxYCLrrLLFEWZ+lL08B+a2YREEroqyfksL6RkyWeWodSaiUa6OH7d2NBc6gvz6zykca9GrHjpQk+puiu81naUO7H4HckEiSoOSLWM2FtyXJvfa0NqjwjiRYaNOycnAna8Rb6ZsEKMNAz3fJZ3tZkPic+XbUMeiKuUuwjkOd7VIBVBW1I1316DygBIl472TobCiZu+cXrbb5GWdRMCHGqS02zIzc2XRVnPcmX1rOWiDtWeXmaZsDnmLR2Zc00o6mh/s83Fji08trNSofP1Aq6+vDsW6maF98k4iC2//opdAmueDF5t0gmb5wxoqdX5z6Q8xax58DfmvnRETCGDDpLcrwIDAQABAoIBAQDBgxrZuBtcqHmfGKsfn4fkukDMrJYCQV826vdJk3K2643jFWaetkd+CWIQfFepVEi3jwpLMUkzjMR7QiGLbLH+73hxDqWgE5HdUe1HjAo4jQ1SlsKQlR7HCnfUzp7dPiNonsENP5cJ5O6UpwVx7B+aYsk26D3BoYRf4e1kel4OSKw6lr611GXAjqiX+59qTZQKb5xTiai6jGiE8BLoIoRvtIh+8rv8Rg0jQkxbmwKUHxGPm/wB3OVoIEzXUjFB2J03NwTEeh4aQfDr983ro5FSVRZ646dkZzOFQZSIvqJAAg46SO6H7D4g9u40fkwXU5/XZzle6dRGOjnfM9s2OP/BAoGBAOoplhu3LHyrCnz5zGJRRx7QxYoFLxIJnU/C/LX+YJrqHoa8buNvv0Cijcf8o3magjtVCdMG6h6A/Y3krWrFZPePwOUD+4g7xUdlNBe0srVGGWUnR4aeybzhs7pSScOMx/j7PkdteMTIk8tfA6fM/iHbvBlF8iUSWWZ87EnDH5ihAoGBANfrulW5dqk7zGukHz13K7yE+Yg7RGwScInPly1RqlktwgxD1kjl9AO1qGk19say/6GBhjk+oIi829D8TovyjuhehtjlMRe8gecwjBPIE4PVpu6EHkRKO5VSsfDeaaioi2qeu9EOs1E+ZpDZFglhroQ3Gxu41tZBbAgrs391/ONPAoGAWW2ac2lIZzBXaBVqlh3eYIlw99409NmRJ7YbF1JYCLHjCKgMXXX+/6tVJIx6zmVQ2WIHx307inzO2RL9m+pZPia7j3su4/+Xv0WKWIddPNfRuQ0ARwx7lVRJdJ4ap8ErWg5x4YuQdO75atEVr08du0aVFr3c1YWlePu6rg0EEyECgYAPsT8imc8I76KktBHdKrsQAW4NO5l2bUSmj2LCVWwW/R9cOtXpCGVam6o4s0ZTHJE9kKdLo8SRC4DCSIQA4ckHFE+ilc2ilv2t6rZTfbgFXdK7BPkaJ3b7HD54bgGp004GmrC1uebIYcucfVp/pgzD6SlcM2vRuIF8eoiaG94cOwKBgQC6rS+E8UrvvZeCTV9HkhJ3wioq1K3qxZeBZFhXOFrJ09iJUCrVDE/IZE7T1kn45uEIqu/gs2Fxqiid8ieIy06Z2u542nmKy3mt4cGMhgTabK0aiySD2aDbPBqWicZ/VSDXeJ9a5RwtSzj0ZnmlEa7oeUKV+7nQzA/t3ZkpwjyGNg==";

    public final static String POST_CONTENT_TYPE_FORM_URLENCODED = "application/x-www-form-urlencoded";

    // login map keys
    public final static String USERNAME_KEY = "username";
    public final static String PASSWORD_KEY = "password";
    public final static String CAPTCHA_KEY = "captcha";
    public final static String VIEWSTATE_KEY = "viewstate";

    // preference related
    public final static String PREF_INITED = "pref_inited";

    public final static String PREF_SCHOOL_NAME_KEY = "pref_school_name";

    public final static String PREF_CMS_USERNAME_KEY = "pref_cms_username";
    public final static String PREF_CMS_PASSWORD_KEY = "pref_cms_password";

    public final static String PREF_LIB_USERNAME_KEY = "pref_lib_username";
    public final static String PREF_LIB_PASSWORD_KEY = "pref_lib_password";

    public final static String PREF_WEEK_SET_KEY = "pref_tmp_week_set";
    public final static String PREF_CURRENT_WEEK_KEY = "current_week_seq";

    public final static String PREF_CMS_PASSWORD_ENCRYPTED = "cms_encrypted";
    public final static String PREF_LIB_PASSWORD_ENCRYPTED = "lib_encrypted";

    // default school name
    public final static String DEFAULT_SCHOOL_NAME = "njit";

    // school cms
    public final static String ZFSOFT = "zfsoft";
    public final static String NJSUWEN = "njsuwen";

    // library system
    public final static String OPAC = "opac";

    // loader results
    public final static int LOGIN_SUCCESS = 1, LOGIN_FAIL = -1;
    public final static int RESULT_OK = 2, RESULT_FAIL = -2;
    public final static int CAPTCHA_IMG_OK = 4, CAPTCHA_IMG_FAIL = -4;
    public final static int LOAD_MORE_OK = 5, LOAD_MORE_FAIL = -5;

    // class info background colors
    public final static String[] colorString = {
            "#8BC34A", "#03A9F4", "#FF9800", "#C5CAE9", "#FFCDD2", "#009688", "#536DFE"
    };

    public static int getColor(int seq) {
        return Color.parseColor(colorString[seq]);
    }

    public static boolean isNetworkConnected(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager =
                    (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if (mNetworkInfo != null) {
                return mNetworkInfo.isAvailable();
            }
        }
        return false;
    }
}