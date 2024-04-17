package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.ui.sleepscore.h2;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class l2 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h2.e f61143a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(h2.e eVar) {
        super(0);
        this.f61143a = eVar;
    }

    @Override // ym0.a
    public final User invoke() {
        h2.e eVar = this.f61143a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = eVar.f61008b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
