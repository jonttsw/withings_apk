package com.withings.details.height;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.details.height.HeightListActivity;
import com.withings.user.User;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity.n f36581a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(HeightListActivity.n nVar) {
        super(0);
        this.f36581a = nVar;
    }

    @Override // ym0.a
    public final User invoke() {
        HeightListActivity.n nVar = this.f36581a;
        nVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = nVar.f36565b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", q0.b(User.class), " is not supported"));
    }
}
