package com.withings.ecg.heartsound;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.ecg.heartsound.HeartSoundListActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartSoundListActivity.c f38491a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(HeartSoundListActivity.c cVar) {
        super(0);
        this.f38491a = cVar;
    }

    @Override // ym0.a
    public final User invoke() {
        HeartSoundListActivity.c cVar = this.f38491a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = cVar.f38412b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
