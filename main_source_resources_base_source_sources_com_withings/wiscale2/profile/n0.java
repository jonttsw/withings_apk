package com.withings.wiscale2.profile;

import android.widget.ImageView;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.l<n20.h, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59413a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q qVar) {
        super(1);
        this.f59413a = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(n20.h hVar) {
        ImageView imageView;
        int i11;
        ImageView imageView2;
        n20.h it = hVar;
        kotlin.jvm.internal.u.j(it, "it");
        q qVar = this.f59413a;
        imageView = qVar.F;
        if (imageView != null) {
            if (ay.b.q(it)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            Integer e11 = ck.b.e(it);
            if (e11 != null) {
                int intValue = e11.intValue();
                imageView2 = qVar.F;
                if (imageView2 != null) {
                    imageView2.setImageResource(intValue);
                } else {
                    kotlin.jvm.internal.u.s("subscriptionIconView");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("subscriptionIconView");
        throw null;
    }
}
