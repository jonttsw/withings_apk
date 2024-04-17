package com.withings.wiscale2.heart.heartrate;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.heart.heartrate.HRMeasuresListActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HRMeasuresListActivity.e f57583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HRMeasuresListActivity.e eVar) {
        super(0);
        this.f57583a = eVar;
    }

    @Override // ym0.a
    public final User invoke() {
        HRMeasuresListActivity.e eVar = this.f57583a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = eVar.f57481b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
