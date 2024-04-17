package com.withings.wiscale2.heart.bloodpressure;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.a<Period> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BloodPressureMeasureListActivity.d f57460a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(BloodPressureMeasureListActivity.d dVar) {
        super(0);
        this.f57460a = dVar;
    }

    @Override // ym0.a
    public final Period invoke() {
        BloodPressureMeasureListActivity.d dVar = this.f57460a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Period.class);
        Activity activity = dVar.f57326b;
        if (isAssignableFrom) {
            return (Period) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "period");
        }
        if (Serializable.class.isAssignableFrom(Period.class)) {
            return (Period) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "period");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra period of class ", q0.b(Period.class), " is not supported"));
    }
}
