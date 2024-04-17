package com.withings.wiscale2.heart.afib;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.heart.afib.y;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y.l f57131a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(y.l lVar) {
        super(0);
        this.f57131a = lVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        y.l lVar = this.f57131a;
        lVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Fragment fragment = lVar.f57298b;
        if (isAssignableFrom) {
            return (Boolean) yq.b.d(fragment, "extra_isMedical");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) yq.b.e(fragment, "extra_isMedical");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_isMedical of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
