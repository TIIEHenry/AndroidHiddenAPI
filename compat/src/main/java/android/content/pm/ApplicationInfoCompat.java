package android.content.pm;

import hiddenapi.reflect.ReflectBuilder;

public class ApplicationInfoCompat {
    public static boolean isSystemApp(ApplicationInfo appInfo) {
        return (appInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0;
    }

    public static long longVersionCode(ApplicationInfo appInfo) {
        try {
            return ReflectBuilder.from(ApplicationInfo.class).field("longVersionCode").getLong(appInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
