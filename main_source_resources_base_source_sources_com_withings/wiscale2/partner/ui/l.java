package com.withings.wiscale2.partner.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.partner.ui.i;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.a<Partner> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i.d f59155a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i.d dVar) {
        super(0);
        this.f59155a = dVar;
    }

    @Override // ym0.a
    public final Partner invoke() {
        i.d dVar = this.f59155a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Partner.class);
        Fragment fragment = dVar.f59111b;
        if (isAssignableFrom) {
            return (Partner) yq.b.d(fragment, "ARG_PARTNER");
        }
        if (Serializable.class.isAssignableFrom(Partner.class)) {
            return (Partner) yq.b.e(fragment, "ARG_PARTNER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra ARG_PARTNER of class ", kotlin.jvm.internal.q0.b(Partner.class), " is not supported"));
    }
}
