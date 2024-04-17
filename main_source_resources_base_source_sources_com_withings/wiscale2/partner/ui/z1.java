package com.withings.wiscale2.partner.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.partner.ui.k1;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class z1 extends kotlin.jvm.internal.w implements ym0.a<Partner> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.g f59259a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(k1.g gVar) {
        super(0);
        this.f59259a = gVar;
    }

    @Override // ym0.a
    public final Partner invoke() {
        k1.g gVar = this.f59259a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Partner.class);
        Fragment fragment = gVar.f59154b;
        if (isAssignableFrom) {
            return (Partner) yq.b.d(fragment, "ARG_PARTNER");
        }
        if (Serializable.class.isAssignableFrom(Partner.class)) {
            return (Partner) yq.b.e(fragment, "ARG_PARTNER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra ARG_PARTNER of class ", kotlin.jvm.internal.q0.b(Partner.class), " is not supported"));
    }
}
