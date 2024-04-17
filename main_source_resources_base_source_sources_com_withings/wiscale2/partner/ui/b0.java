package com.withings.wiscale2.partner.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.partner.ui.z;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.a<Partner> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z.c f58909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z.c cVar) {
        super(0);
        this.f58909a = cVar;
    }

    @Override // ym0.a
    public final Partner invoke() {
        z.c cVar = this.f58909a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Partner.class);
        Fragment fragment = cVar.f59254b;
        if (isAssignableFrom) {
            return (Partner) yq.b.d(fragment, "EXTRA_PARTNER");
        }
        if (Serializable.class.isAssignableFrom(Partner.class)) {
            return (Partner) yq.b.e(fragment, "EXTRA_PARTNER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_PARTNER of class ", kotlin.jvm.internal.q0.b(Partner.class), " is not supported"));
    }
}
