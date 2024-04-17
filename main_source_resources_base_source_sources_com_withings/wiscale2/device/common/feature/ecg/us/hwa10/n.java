package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.Hwa10EcgActivationActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class n extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa10EcgActivationActivity.d f51815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Hwa10EcgActivationActivity.d dVar) {
        super(0);
        this.f51815a = dVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        Hwa10EcgActivationActivity.d dVar = this.f51815a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = dVar.f51801b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, "isEcgSw1");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, "isEcgSw1");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra isEcgSw1 of class ", q0.b(Boolean.class), " is not supported"));
    }
}
