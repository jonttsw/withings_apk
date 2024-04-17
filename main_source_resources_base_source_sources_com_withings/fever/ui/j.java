package com.withings.fever.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.fever.ui.BodyTemperatureActivity;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyTemperatureActivity.c f39306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BodyTemperatureActivity.c cVar) {
        super(0);
        this.f39306a = cVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        BodyTemperatureActivity.c cVar = this.f39306a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = cVar.f39211b;
        if (isAssignableFrom) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra date of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
