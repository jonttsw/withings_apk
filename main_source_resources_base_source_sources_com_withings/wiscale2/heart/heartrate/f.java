package com.withings.wiscale2.heart.heartrate;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.heart.heartrate.HRMeasuresListActivity;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HRMeasuresListActivity.f f57643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HRMeasuresListActivity.f fVar) {
        super(0);
        this.f57643a = fVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        HRMeasuresListActivity.f fVar = this.f57643a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = fVar.f57483b;
        if (isAssignableFrom) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_date_start");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_date_start");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_date_start of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
