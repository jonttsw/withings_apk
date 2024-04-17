package com.withings.wiscale2.vascularage;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.vascularage.y;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y.g f62300a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(y.g gVar) {
        super(0);
        this.f62300a = gVar;
    }

    @Override // ym0.a
    public final User invoke() {
        y.g gVar = this.f62300a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = gVar.f62551b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
