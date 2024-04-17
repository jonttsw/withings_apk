package com.withings.wiscale2.device.hwa08.postinstall;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.device.hwa08.postinstall.Hwa08PostInstallActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa08PostInstallActivity.d f54478a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Hwa08PostInstallActivity.d dVar) {
        super(0);
        this.f54478a = dVar;
    }

    @Override // ym0.a
    public final User invoke() {
        Hwa08PostInstallActivity.d dVar = this.f54478a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = dVar.f54419b;
        if (isAssignableFrom) {
            return (User) b0.F(activity, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) b0.H(activity, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", q0.b(User.class), " is not supported"));
    }
}
