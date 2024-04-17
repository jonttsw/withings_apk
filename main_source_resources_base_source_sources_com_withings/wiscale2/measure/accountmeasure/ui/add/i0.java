package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.measure.accountmeasure.ui.add.h0;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0.c f58196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0.c cVar) {
        super(0);
        this.f58196a = cVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        h0.c cVar = this.f58196a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Fragment fragment = cVar.f58187b;
        if (isAssignableFrom) {
            return (Boolean) yq.b.d(fragment, "EXTRA_FROM_DETAIL");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) yq.b.e(fragment, "EXTRA_FROM_DETAIL");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_FROM_DETAIL of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
