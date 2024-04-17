package com.withings.ecg.details;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.ecg.details.g;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g.C0502g f38362a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g.C0502g c0502g) {
        super(0);
        this.f38362a = c0502g;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        g.C0502g c0502g = this.f38362a;
        c0502g.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Fragment fragment = c0502g.f38219b;
        if (isAssignableFrom) {
            return (Boolean) yq.b.d(fragment, "forResult");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) yq.b.e(fragment, "forResult");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra forResult of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
