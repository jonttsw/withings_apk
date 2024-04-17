package com.withings.wiscale2.partner.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.User;
import com.withings.wiscale2.partner.ui.k1;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class y1 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.f f59244a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(k1.f fVar) {
        super(0);
        this.f59244a = fVar;
    }

    @Override // ym0.a
    public final User invoke() {
        k1.f fVar = this.f59244a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = fVar.f59152b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "ARG_USER");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "ARG_USER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra ARG_USER of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
