package com.withings.wiscale2.device.wpm.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.User;
import com.withings.wiscale2.device.wpm.ui.c0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c0.g f55741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c0.g gVar) {
        super(0);
        this.f55741a = gVar;
    }

    @Override // ym0.a
    public final User invoke() {
        c0.g gVar = this.f55741a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = gVar.f55730b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", q0.b(User.class), " is not supported"));
    }
}
