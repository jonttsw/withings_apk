package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.w0;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class e1 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0.e f61297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(w0.e eVar) {
        super(0);
        this.f61297a = eVar;
    }

    @Override // ym0.a
    public final User invoke() {
        w0.e eVar = this.f61297a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = eVar.f61490b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "key_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "key_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra key_user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
