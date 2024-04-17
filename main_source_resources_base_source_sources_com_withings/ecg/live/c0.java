package com.withings.ecg.live;

import android.widget.TextView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38657a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38657a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        nm0.y yVar;
        Integer num2 = num;
        LiveEcgActivity liveEcgActivity = this.f38657a;
        if (num2 != null) {
            int intValue = num2.intValue();
            TextView F3 = LiveEcgActivity.F3(liveEcgActivity);
            kotlin.jvm.internal.u.i(F3, "access$getLiveHR(...)");
            if (F3.getVisibility() != 0) {
                TextView F32 = LiveEcgActivity.F3(liveEcgActivity);
                kotlin.jvm.internal.u.i(F32, "access$getLiveHR(...)");
                F32.setVisibility(0);
            }
            LiveEcgActivity.F3(liveEcgActivity).setText(liveEcgActivity.getString(C1987R.string.ecg_live_liveHR, String.valueOf(intValue)));
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            TextView F33 = LiveEcgActivity.F3(liveEcgActivity);
            kotlin.jvm.internal.u.i(F33, "access$getLiveHR(...)");
            F33.setVisibility(8);
        }
        return nm0.y.f85009a;
    }
}
