package android.app;

import static android.Manifest.permission.CONTROL_REMOTE_APP_TRANSITION_ANIMATIONS;
import static android.app.WindowConfiguration.WINDOWING_MODE_PINNED;
import static android.app.WindowConfiguration.inMultiWindowMode;
import static android.os.Process.myUid;

import static java.lang.Character.MIN_VALUE;

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