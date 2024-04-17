package com.withings.ecg.heartsound;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.ecg.heartsound.d;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d.g f38492a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d.g gVar) {
        super(0);
        this.f38492a = gVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        d.g gVar = this.f38492a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Fragment fragment = gVar.f38453b;
        if (isAssignableFrom) {
            return (Boolean) yq.b.d(fragment, "isFirst");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) yq.b.e(fragment, "isFirst");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra isFirst of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
