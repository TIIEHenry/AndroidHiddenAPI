package android.app;

import hiddenapi.reflect.ReflectBuilder;

public class AppOpsManagerCompat {
    public static final String OPSTR_REQUEST_INSTALL_PACKAGES = "android:request_install_packages";

    public static int OP_REQUEST_INSTALL_PACKAGES = 66;

    static {
        try {
            OP_REQUEST_INSTALL_PACKAGES = ReflectBuilder.from(AppOpsManager.class).field("OP_REQUEST_INSTALL_PACKAGES").getInt(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int permissionToOpCode(String requestInstallPackages) throws Exception {
        return (int) ReflectBuilder.from(AppOpsManager.class).method("permissionToOpCode", String.class).invoke(null, requestInstallPackages);
    }

    public static void setMode(AppOpsManager appOpsManager, int appOpCode, int uid, String pkgName, int mode) throws Exception {
        ReflectBuilder.from(AppOpsManager.class).method("setMode", int.class, int.class, String.class, int.class).invoke(appOpsManager, appOpCode, uid, pkgName, mode);
    }
}
