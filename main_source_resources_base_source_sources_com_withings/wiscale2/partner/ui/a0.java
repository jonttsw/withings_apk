package com.withings.wiscale2.partner.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.User;
import com.withings.wiscale2.partner.ui.z;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z.b f58890a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z.b bVar) {
        super(0);
        this.f58890a = bVar;
    }

    @Override // ym0.a
    public final User invoke() {
        z.b bVar = this.f58890a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = bVar.f59252b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "EXTRA_USER");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "EXTRA_USER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_USER of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
