package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepDisorderActivity.f f61380a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SleepDisorderActivity.f fVar) {
        super(0);
        this.f61380a = fVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        SleepDisorderActivity.f fVar = this.f61380a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = fVar.f61262b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "is_sleep_apnea");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "is_sleep_apnea");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra is_sleep_apnea of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
