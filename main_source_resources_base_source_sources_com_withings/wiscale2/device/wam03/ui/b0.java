package com.withings.wiscale2.device.wam03.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.wam03.ui.Wam03PostInstallActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wam03PostInstallActivity.d f54985a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Wam03PostInstallActivity.d dVar) {
        super(0);
        this.f54985a = dVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        Wam03PostInstallActivity.d dVar = this.f54985a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = dVar.f54981b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_allow_quit");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_allow_quit");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_allow_quit of class ", q0.b(Boolean.class), " is not supported"));
    }
}
