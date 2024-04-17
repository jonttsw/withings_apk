package com.withings.wiscale2.activity.workout.live.ui;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import com.withings.wiscale2.C1987R;
/* compiled from: LiveWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class j extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48895a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(LiveWorkoutActivity liveWorkoutActivity) {
        super(0);
        this.f48895a = liveWorkoutActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Intent e11;
        androidx.activity.result.b bVar;
        int i11 = Build.VERSION.SDK_INT;
        LiveWorkoutActivity liveWorkoutActivity = this.f48895a;
        if (i11 >= 31) {
            Application application = liveWorkoutActivity.getApplication();
            kotlin.jvm.internal.u.i(application, "getApplication(...)");
            e11 = com.withings.wiscale2.measure.accountmeasure.ui.add.g0.d(C1987R.string.installation_gpsAlreadyTitle_android12, C1987R.string.installation_gpsAlreadyDescription_android12, 2131231080, application, false);
        } else {
            Application application2 = liveWorkoutActivity.getApplication();
            kotlin.jvm.internal.u.i(application2, "getApplication(...)");
            e11 = com.withings.wiscale2.measure.accountmeasure.ui.add.g0.e(application2, 0, 0, false, 30);
        }
        bVar = liveWorkoutActivity.f48812y;
        bVar.a(e11);
        return nm0.y.f85009a;
    }
}
