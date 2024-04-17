package com.withings.wiscale2.heart.afib;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.v0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.C1987R;
/* compiled from: AFibNotificationDelegate.kt */
/* loaded from: classes5.dex */
public final class l0 implements zx.u {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57208a;

    public l0(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f57208a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.core.app.u, androidx.core.app.q] */
    @Override // zx.u
    public final void z(long j5, MeasuresGroup measuresGroup, boolean z5) {
        Measure measureForType = measuresGroup.getMeasureForType(ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT);
        Measure measureForType2 = measuresGroup.getMeasureForType(ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT);
        if (!z5 && measuresGroup.getAttrib() == 7) {
            if (measureForType != null || measureForType2 != null) {
                if (measureForType == null) {
                    measureForType = measureForType2;
                }
                kotlin.jvm.internal.u.g(measureForType);
                int i11 = AFibDetailActivity.f57077j;
                Long valueOf = Long.valueOf(j5);
                Context context = this.f57208a;
                Intent putExtra = com.withings.authentication.n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, AFibDetailActivity.class).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, valueOf).putExtra("measure", measureForType);
                kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
                PendingIntent activity = PendingIntent.getActivity(context, 0, putExtra, 201326592);
                String string = context.getString(C1987R.string.notification_irregular_heartbeat_title);
                String c11 = v0.c(string, "getString(...)", context, C1987R.string.tap_here_to_learn_more, "getString(...)");
                androidx.core.app.r rVar = new androidx.core.app.r(context, "measure_channel_afib");
                rVar.m(string);
                rVar.l(c11);
                rVar.y(1);
                rVar.u(true);
                rVar.B(2131231550);
                ?? uVar = new androidx.core.app.u();
                uVar.g(string);
                uVar.h(c11);
                rVar.D(uVar);
                rVar.k(activity);
                androidx.core.app.y.c(context).e(null, 600, rVar.c());
            }
        }
    }

    @Override // zx.u
    public final void a0(long j5, MeasuresGroup measuresGroup) {
    }

    @Override // zx.u
    public final void l(long j5, MeasuresGroup measuresGroup) {
    }
}
