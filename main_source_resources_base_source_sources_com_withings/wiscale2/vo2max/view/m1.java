package com.withings.wiscale2.vo2max.view;

import android.content.Context;
import android.view.View;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
/* compiled from: Vo2maxFragment.kt */
/* loaded from: classes5.dex */
final class m1 extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i1 f62788a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(i1 i1Var) {
        super(1);
        this.f62788a = i1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        Integer num;
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        kn.e c11 = kn.e.c();
        i1 i1Var = this.f62788a;
        Long deviceId = i1.w1(i1Var).getDeviceId();
        kotlin.jvm.internal.u.i(deviceId, "getDeviceId(...)");
        Device d11 = c11.d(deviceId.longValue());
        if (d11 != null) {
            num = Integer.valueOf(d11.getModelId());
        } else {
            num = null;
        }
        int i11 = C1987R.string.hwa09_workoutDetail_notificationUrl_vo2max;
        if ((num == null || num.intValue() != 93) && (num == null || num.intValue() != 95)) {
            i11 = C1987R.string.vo2maxDetail_learnMoreURL;
        }
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = it.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        i1Var.startActivity(aVar.b(context, Integer.valueOf((int) C1987R.string.vo2max), i11));
        return nm0.y.f85009a;
    }
}
