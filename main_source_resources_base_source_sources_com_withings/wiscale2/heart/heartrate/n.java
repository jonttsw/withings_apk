package com.withings.wiscale2.heart.heartrate;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.heart.heartrate.HeartRateAwakeAverageActivity;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateAwakeAverageActivity.d f57701a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(HeartRateAwakeAverageActivity.d dVar) {
        super(0);
        this.f57701a = dVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        HeartRateAwakeAverageActivity.d dVar = this.f57701a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = dVar.f57494b;
        if (isAssignableFrom) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_HR_AGGREGATE_DATE");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_HR_AGGREGATE_DATE");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_HR_AGGREGATE_DATE of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
