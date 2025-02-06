package android.app.admin;

import hiddenapi.reflect.ReflectBuilder;

public class DevicePolicyManagerCompat {
    public static boolean packageHasActiveAdmins(DevicePolicyManager dpm, String packageName) throws Exception {
        return (boolean) ReflectBuilder.from(DevicePolicyManager.class).method("packageHasActiveAdmins", String.class).invoke(dpm, packageName);
    }
}
