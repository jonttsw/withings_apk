package com.withings.programs.ui.activity;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.ui.activity.TutorialProxyActivity;
import com.withings.user.User;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class k extends w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialProxyActivity.c f43769a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TutorialProxyActivity.c cVar) {
        super(0);
        this.f43769a = cVar;
    }

    @Override // ym0.a
    public final User invoke() {
        TutorialProxyActivity.c cVar = this.f43769a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = cVar.f43759b;
        if (isAssignableFrom) {
            return (User) b0.F(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) b0.H(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", q0.b(User.class), " is not supported"));
    }
}
