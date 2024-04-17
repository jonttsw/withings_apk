package com.withings.wiscale2.heart.afib;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.heart.afib.f0;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f0.d f57158a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0.d dVar) {
        super(0);
        this.f57158a = dVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        f0.d dVar = this.f57158a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Fragment fragment = dVar.f57154b;
        if (isAssignableFrom) {
            return (Boolean) yq.b.d(fragment, "isMedical");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) yq.b.e(fragment, "isMedical");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra isMedical of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
