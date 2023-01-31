package android.app;

import static android.Manifest.permission.CONTROL_REMOTE_APP_TRANSITION_ANIMATIONS;
import static android.app.WindowConfiguration.WINDOWING_MODE_PINNED;
import static android.app.WindowConfiguration.inMultiWindowMode;
import static android.os.Process.myUid;



import android.annotation.CallSuper;
import android.annotation.DrawableRes;
import android.annotation.IdRes;
import android.annotation.IntDef;
import android.annotation.LayoutRes;
import android.annotation.MainThread;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.annotation.RequiresPermission;
import android.annotation.StyleRes;
import android.annotation.SystemApi;
import android.annotation.TestApi;
import android.annotation.UiContext;
import android.app.VoiceInteractor.Request;


/**
 * 2022-5-13 11:49:28 diff
 */
private static final class ManagedCursor {
    ManagedCursor(Cursor cursor) {
        mCursor = cursor;
        mReleased = false;
        mUpdated = false;
    }

    private final Cursor mCursor;
    private boolean mReleased;
    private boolean mUpdated;
}

/**
 * 2022-5-13 11:54:31 add
 */
private AutofillManager getAutofillManager() {
        if (mAutofillManager == null) {
            mAutofillManager = getSystemService(AutofillManager.class);
        }

        return mAutofillManager;
    }

/**
 * 2023-1-31 09:35:25 add
 */

void test(){
    System.out.println("test");
}

/**
 * 2023-1-31 09:38:02 add
 */

int sun(int a, int b){
    return a + b ;
}
