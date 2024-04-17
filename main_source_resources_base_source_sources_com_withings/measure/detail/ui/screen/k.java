package com.withings.measure.detail.ui.screen;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.measure.detail.ui.screen.MeasureDetailActivity;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.a<Period> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity.f f41768a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MeasureDetailActivity.f fVar) {
        super(0);
        this.f41768a = fVar;
    }

    @Override // ym0.a
    public final Period invoke() {
        MeasureDetailActivity.f fVar = this.f41768a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Period.class);
        Activity activity = fVar.f41751b;
        if (isAssignableFrom) {
            return (Period) b0.F(activity, "EXTRA_PERIOD");
        }
        if (Serializable.class.isAssignableFrom(Period.class)) {
            return (Period) b0.H(activity, "EXTRA_PERIOD");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_PERIOD of class ", q0.b(Period.class), " is not supported"));
    }
}
