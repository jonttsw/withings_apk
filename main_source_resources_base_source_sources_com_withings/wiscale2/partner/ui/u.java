package com.withings.wiscale2.partner.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.partner.ui.PartnerActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PartnerActivity.f f59219a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(PartnerActivity.f fVar) {
        super(0);
        this.f59219a = fVar;
    }

    @Override // ym0.a
    public final User invoke() {
        PartnerActivity.f fVar = this.f59219a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = fVar.f58882b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
