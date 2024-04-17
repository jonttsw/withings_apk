package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class n3 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepScoreSnoringActivity.l f61177a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(SleepScoreSnoringActivity.l lVar) {
        super(0);
        this.f61177a = lVar;
    }

    @Override // ym0.a
    public final User invoke() {
        SleepScoreSnoringActivity.l lVar = this.f61177a;
        lVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = lVar.f60805b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_USER");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_USER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_USER of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
