package android.content.pm;

import hiddenapi.reflect.ReflectBuilder;

public class PackageInstallerCompat {
    public static final String EXTRA_LEGACY_STATUS = "android.content.pm.extra.LEGACY_STATUS";
    public static final String ACTION_CONFIRM_INSTALL = "android.content.pm.action.CONFIRM_INSTALL";

    public static class SessionParams {
        public static final int UID_UNKNOWN = -1;

        public static String abiOverride(PackageInstaller.SessionParams params) {
            try {
                return ReflectBuilder.from(PackageInstaller.SessionParams.class).field("abiOverride").getAs(params);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
