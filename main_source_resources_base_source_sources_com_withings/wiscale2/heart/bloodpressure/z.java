package com.withings.wiscale2.heart.bloodpressure;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BloodPressureMeasureListActivity.e f57461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(BloodPressureMeasureListActivity.e eVar) {
        super(0);
        this.f57461a = eVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        BloodPressureMeasureListActivity.e eVar = this.f57461a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = eVar.f57328b;
        if (isAssignableFrom) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra date of class ", q0.b(DateTime.class), " is not supported"));
    }
}
