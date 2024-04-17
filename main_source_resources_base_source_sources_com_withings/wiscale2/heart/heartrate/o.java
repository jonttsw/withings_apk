package com.withings.wiscale2.heart.heartrate;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.heart.heartrate.HeartRateAwakeAverageActivity;
import com.withings.wiscale2.vasistas.body.HRZonesAggregate;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.w implements ym0.a<HRZonesAggregate> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateAwakeAverageActivity.e f57706a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(HeartRateAwakeAverageActivity.e eVar) {
        super(0);
        this.f57706a = eVar;
    }

    @Override // ym0.a
    public final HRZonesAggregate invoke() {
        HeartRateAwakeAverageActivity.e eVar = this.f57706a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(HRZonesAggregate.class);
        Activity activity = eVar.f57496b;
        if (isAssignableFrom) {
            return (HRZonesAggregate) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_HR_AGGREGATE");
        }
        if (Serializable.class.isAssignableFrom(HRZonesAggregate.class)) {
            return (HRZonesAggregate) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_HR_AGGREGATE");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_HR_AGGREGATE of class ", kotlin.jvm.internal.q0.b(HRZonesAggregate.class), " is not supported"));
    }
}
