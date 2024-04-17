package com.withings.wiscale2.activity;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.activity.ActivityActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class d extends w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ActivityActivity.j f48261a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ActivityActivity.j jVar) {
        super(0);
        this.f48261a = jVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        ActivityActivity.j jVar = this.f48261a;
        jVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = jVar.f48249b;
        if (isAssignableFrom) {
            return (DateTime) b0.F(activity, "date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) b0.H(activity, "date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra date of class ", q0.b(DateTime.class), " is not supported"));
    }
}
