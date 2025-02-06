package android.os;


import java.util.List;

import hiddenapi.reflect.ReflectBuilder;

public class UserManagerCompat {
    public static final int RESTRICTION_NOT_SET = 0x0;

    public static List<UserHandle> getUserHandles(UserManager userManager, boolean excludeDying) throws Exception {
        return ReflectBuilder.from(UserManager.class).method("getUserHandles", boolean.class).invokeAs(userManager, excludeDying);
    }

    public static boolean isGuestUser(UserManager userManager) throws Exception {
        return ReflectBuilder.from(UserManager.class).method("isGuestUser").invokeAs(userManager);
    }

    public static UserHandle getProfileParent(UserManager userManager, UserHandle profileHandle) {
        try {
            return ReflectBuilder.from(UserManager.class).method("getProfileParent", UserHandle.class).invokeAs(userManager, profileHandle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int getUserRestrictionSource(UserManager mUserManager, String disallowInstallApps, UserHandle userHandle) {
        try {
            return ReflectBuilder.from(UserManager.class).method("getUserRestrictionSource", String.class, UserHandle.class).invokeAs(disallowInstallApps, userHandle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return UserManagerCompat.RESTRICTION_NOT_SET;
    }
}
