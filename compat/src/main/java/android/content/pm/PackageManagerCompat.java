package android.content.pm;

import android.os.UserHandle;

import hiddenapi.reflect.ReflectBuilder;

public class PackageManagerCompat {
    public static final int DELETE_KEEP_DATA = 0x00000001;
    public static final int DELETE_ALL_USERS = 0x00000002;
    public static final int DELETE_FAILED_DEVICE_POLICY_MANAGER = -2;
    public static final int DELETE_FAILED_OWNER_BLOCKED = -4;
    public static final int INSTALL_SUCCEEDED = 1;
    public static final int INSTALL_FAILED_INVALID_APK = -2;
    public static final int INSTALL_FAILED_INVALID_URI = -3;

    public static boolean canUserUninstall(PackageManager packageManager, String packageName, UserHandle handle) {
        try {
            return ReflectBuilder.from(PackageManager.class).method("canUserUninstall", String.class, UserHandle.class).invokeAs(packageManager, packageName, handle)
        } catch (Exception e) {
            return false;
        }
    }
}
