package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRegularityActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class j3 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreRegularityActivity.o f61061a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(SleepScoreRegularityActivity.o oVar) {
        super(0);
        this.f61061a = oVar;
    }

    @Override // ym0.a
    public final User invoke() {
        SleepScoreRegularityActivity.o oVar = this.f61061a;
        oVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = oVar.f60761b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_USER");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_USER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_USER of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
