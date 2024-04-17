package com.withings.wiscale2.spo2;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.spo2.SpO2MeasuresListActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SpO2MeasuresListActivity.f f61680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SpO2MeasuresListActivity.f fVar) {
        super(0);
        this.f61680a = fVar;
    }

    @Override // ym0.a
    public final User invoke() {
        SpO2MeasuresListActivity.f fVar = this.f61680a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = fVar.f61612b;
        if (isAssignableFrom) {
            return (User) b0.F(activity, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) b0.H(activity, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", q0.b(User.class), " is not supported"));
    }
}
