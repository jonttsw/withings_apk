package com.withings.wiscale2.device.hwa03bs.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.hwa03bs.ui.Hwa03PostInstallActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa03PostInstallActivity.c f54255a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Hwa03PostInstallActivity.c cVar) {
        super(0);
        this.f54255a = cVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        Hwa03PostInstallActivity.c cVar = this.f54255a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = cVar.f54250b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_allow_quit");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_allow_quit");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_allow_quit of class ", q0.b(Boolean.class), " is not supported"));
    }
}
