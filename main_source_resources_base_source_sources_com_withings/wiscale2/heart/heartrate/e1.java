package com.withings.wiscale2.heart.heartrate;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.User;
import com.withings.wiscale2.heart.heartrate.a1;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class e1 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a1.b f57619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(a1.b bVar) {
        super(0);
        this.f57619a = bVar;
    }

    @Override // ym0.a
    public final User invoke() {
        a1.b bVar = this.f57619a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = bVar.f57553b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
