package xin.oaec.xwls.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kevin on 2017/4/4.
 */
public class StringUtils {

	public static String replaceBlank(String str) {
		String dest = "";
		if (str != null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}
}
