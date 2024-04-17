package com.withings.wiscale2.device.hwa03bs.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.device.hwa03bs.ui.Hwa03PostInstallActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa03PostInstallActivity.a f54252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Hwa03PostInstallActivity.a aVar) {
        super(0);
        this.f54252a = aVar;
    }

    @Override // ym0.a
    public final User invoke() {
        Hwa03PostInstallActivity.a aVar = this.f54252a;
        aVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = aVar.f54246b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", q0.b(User.class), " is not supported"));
    }
}
