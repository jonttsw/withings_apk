package com.withings.wiscale2.heart.afib;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.heart.afib.AFibMeasuresListActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AFibMeasuresListActivity.f f57227a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AFibMeasuresListActivity.f fVar) {
        super(0);
        this.f57227a = fVar;
    }

    @Override // ym0.a
    public final User invoke() {
        AFibMeasuresListActivity.f fVar = this.f57227a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = fVar.f57103b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
