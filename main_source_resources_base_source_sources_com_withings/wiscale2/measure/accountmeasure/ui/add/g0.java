package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import java.util.concurrent.CancellationException;
/* compiled from: AddMeasureActivity_MembersInjector.java */
/* loaded from: classes5.dex */
public final class g0 implements ak0.b {
    public static final void a(Throwable th2) {
        Throwable th3;
        try {
            th3 = io.ktor.utils.io.a0.b(th2, th2);
        } catch (Throwable unused) {
            th3 = null;
        }
        if (th3 == null) {
            throw th2;
        }
        throw th3;
    }

    public static final String b(Track track, Context context) {
        if (!kotlin.collections.l.l(new int[]{0, -1, 1}, track.getBrand())) {
            return wy.a.a(track.getBrand());
        }
        int deviceModel = track.getDeviceModel();
        int i11 = wy.a.f106180b;
        if (1055 <= deviceModel && deviceModel < 1063) {
            return wy.a.d(track.getDeviceModel());
        }
        int deviceModel2 = track.getDeviceModel();
        if (deviceModel2 != 1053 && deviceModel2 != 1051) {
            if (track.getDeviceModel() != 0) {
                return wy.a.f(track.getDeviceModel(), context);
            }
            if (track.getDeviceType() != -1) {
                return wy.a.e(track.getDeviceType(), context);
            }
            if (track.getBrand() != -1) {
                return "Withings";
            }
            return null;
        }
        return context.getString(C1987R.string._APP_NAME_);
    }

    public static rs.i c(Context context, m90.d uiModel, boolean z5, int i11, int i12, float f11) {
        float value;
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(uiModel, "uiModel");
        ct.d dVar = new ct.d(context);
        float i13 = bt.a.i(uiModel.a());
        if (z5) {
            value = uiModel.b();
        } else {
            value = uiModel.getValue();
        }
        return dVar.a(i13, value, uiModel, i11, i12, f11);
    }

    public static final Intent d(int i11, int i12, int i13, Context context, boolean z5) {
        Intent putExtra = androidx.fragment.app.o.b(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.activity.workout.gps.ui.RequestLocationPermissionAndSettingsActivity").putExtra("EXTRA_SCREEN_TITLE", i11).putExtra("EXTRA_SCREEN_MESSAGE", i12).putExtra("EXTRA_IMAGE", i13).putExtra("EXTRA_ASK_BACKGROUND", z5);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        return putExtra;
    }

    public static /* synthetic */ Intent e(Context context, int i11, int i12, boolean z5, int i13) {
        if ((i13 & 2) != 0) {
            i11 = C1987R.string.liveWorkout_locationPermission_title;
        }
        if ((i13 & 4) != 0) {
            i12 = C1987R.string.liveWorkout_locationPermission_desc;
        }
        if ((i13 & 16) != 0) {
            z5 = false;
        }
        return d(i11, i12, 2131232491, context, z5);
    }

    public static final nm0.j f(Object obj, Object obj2) {
        return new nm0.j(obj, obj2);
    }

    public static final Throwable g(Throwable th2) {
        Throwable th3 = th2;
        while (th3 instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) th3;
            if (kotlin.jvm.internal.u.e(th3, cancellationException.getCause())) {
                return th2;
            }
            th3 = cancellationException.getCause();
        }
        if (th3 != null) {
            return th3;
        }
        return th2;
    }
}
