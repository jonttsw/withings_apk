package com.withings.wiscale2.profile;

import android.view.View;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class d0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59312a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(q qVar) {
        super(1);
        this.f59312a = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        View view;
        int i11;
        boolean booleanValue = bool.booleanValue();
        view = this.f59312a.f59437u;
        if (view != null) {
            if (booleanValue) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("profilePartnerView");
        throw null;
    }
}
