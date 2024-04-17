package com.withings.wiscale2.activity.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.activity.ui.VasistasInfoActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class j extends w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VasistasInfoActivity.t f48640a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(VasistasInfoActivity.t tVar) {
        super(0);
        this.f48640a = tVar;
    }

    @Override // ym0.a
    public final User invoke() {
        VasistasInfoActivity.t tVar = this.f48640a;
        tVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = tVar.f48610b;
        if (isAssignableFrom) {
            return (User) b0.F(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) b0.H(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", q0.b(User.class), " is not supported"));
    }
}
