package com.withings.wiscale2.dashboard;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.dashboard.i;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Fragment.kt */
/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i.c f50589a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i.c cVar) {
        super(0);
        this.f50589a = cVar;
    }

    @Override // ym0.a
    public final User invoke() {
        i.c cVar = this.f50589a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = cVar.f50535b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", q0.b(User.class), " is not supported"));
    }
}
