package com.withings.wiscale2.heart.afib;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.heart.afib.AFibMeasuresListActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AFibMeasuresListActivity.h f57235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AFibMeasuresListActivity.h hVar) {
        super(0);
        this.f57235a = hVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        AFibMeasuresListActivity.h hVar = this.f57235a;
        hVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = hVar.f57107b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_is_medical");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_is_medical");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_is_medical of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
