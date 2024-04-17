package com.withings.wiscale2;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.ShareWithMyDoctorActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class q2 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ShareWithMyDoctorActivity.c f59570a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(ShareWithMyDoctorActivity.c cVar) {
        super(0);
        this.f59570a = cVar;
    }

    @Override // ym0.a
    public final User invoke() {
        ShareWithMyDoctorActivity.c cVar = this.f59570a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = cVar.f47981b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
