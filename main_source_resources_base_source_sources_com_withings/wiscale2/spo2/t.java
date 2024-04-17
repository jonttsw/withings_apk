package com.withings.wiscale2.spo2;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.spo2.Spo2Activity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spo2Activity.j f61691a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Spo2Activity.j jVar) {
        super(0);
        this.f61691a = jVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        Spo2Activity.j jVar = this.f61691a;
        jVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = jVar.f61641b;
        if (isAssignableFrom) {
            return (DateTime) b0.F(activity, "date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) b0.H(activity, "date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra date of class ", q0.b(DateTime.class), " is not supported"));
    }
}
