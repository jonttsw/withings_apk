package com.withings.wiscale2.device.hwa06.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.device.hwa06.ui.Hwa06PostInstallActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa06PostInstallActivity.b f54367a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Hwa06PostInstallActivity.b bVar) {
        super(0);
        this.f54367a = bVar;
    }

    @Override // ym0.a
    public final User invoke() {
        Hwa06PostInstallActivity.b bVar = this.f54367a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = bVar.f54327b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", q0.b(User.class), " is not supported"));
    }
}
