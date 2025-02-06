package android.content;

import android.os.UserHandle;

import hiddenapi.reflect.ReflectBuilder;

public class ContextCompat {
    public static Context createContextAsUser(Context context, UserHandle user, int flags) throws Exception {
        return (Context) ReflectBuilder.from(Context.class).method("createContextAsUser", UserHandle.class, int.class).invoke(context, user, flags);
    }
}
