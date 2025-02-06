package android.os;

import hiddenapi.reflect.ReflectBuilder;

public class UserHandleCompat {
    public static final int PER_USER_RANGE = 100000;

    public static int myUserId() {
        return getUserId(Process.myUid());
    }

    public static int getUserId(int uid) {
        try {
            return ReflectBuilder.from(UserHandle.class).method("getUserId", int.class).invokeStaticAs(uid);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static UserHandle SYSTEM() {
        try {
            return ReflectBuilder.from(UserHandle.class).field("SYSTEM").getStaticAs();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
