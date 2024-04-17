package com.withings.wiscale2.partner.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.partner.ui.e0;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.w implements ym0.a<Partner> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0.m f59243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e0.m mVar) {
        super(0);
        this.f59243a = mVar;
    }

    @Override // ym0.a
    public final Partner invoke() {
        e0.m mVar = this.f59243a;
        mVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Partner.class);
        Fragment fragment = mVar.f58991b;
        if (isAssignableFrom) {
            return (Partner) yq.b.d(fragment, "ARG_PARTNER");
        }
        if (Serializable.class.isAssignableFrom(Partner.class)) {
            return (Partner) yq.b.e(fragment, "ARG_PARTNER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra ARG_PARTNER of class ", kotlin.jvm.internal.q0.b(Partner.class), " is not supported"));
    }
}
