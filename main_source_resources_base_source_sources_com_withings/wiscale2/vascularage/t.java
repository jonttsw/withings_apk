package com.withings.wiscale2.vascularage;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.vascularage.VascularAgeActivityV1;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VascularAgeActivityV1.j f62480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(VascularAgeActivityV1.j jVar) {
        super(0);
        this.f62480a = jVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        VascularAgeActivityV1.j jVar = this.f62480a;
        jVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = jVar.f62236b;
        if (isAssignableFrom) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra date of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
