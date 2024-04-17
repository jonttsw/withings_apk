package com.withings.wiscale2.device.hwa08.postinstall;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.hwa08.postinstall.Hwa08PostInstallActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa08PostInstallActivity.f f54480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Hwa08PostInstallActivity.f fVar) {
        super(0);
        this.f54480a = fVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        Hwa08PostInstallActivity.f fVar = this.f54480a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = fVar.f54423b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, "extra_allow_quit");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, "extra_allow_quit");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_allow_quit of class ", q0.b(Boolean.class), " is not supported"));
    }
}
