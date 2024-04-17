package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepDisorderActivity.g f61383a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SleepDisorderActivity.g gVar) {
        super(0);
        this.f61383a = gVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        SleepDisorderActivity.g gVar = this.f61383a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = gVar.f61264b;
        if (isAssignableFrom) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra date of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
