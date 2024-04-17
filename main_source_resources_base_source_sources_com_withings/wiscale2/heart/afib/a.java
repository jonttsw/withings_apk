package com.withings.wiscale2.heart.afib;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.heart.afib.AFibActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AFibActivity.b f57126a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AFibActivity.b bVar) {
        super(0);
        this.f57126a = bVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        AFibActivity.b bVar = this.f57126a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = bVar.f57076b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "is_medical");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "is_medical");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra is_medical of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
