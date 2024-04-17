package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import androidx.lifecycle.u;
import i6.a;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
final class e extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgReviewActivity f52004a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EcgReviewActivity ecgReviewActivity) {
        super(2);
        this.f52004a = ecgReviewActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        i6.a aVar2;
        androidx.compose.runtime.a aVar3 = aVar;
        if ((num.intValue() & 11) == 2 && aVar3.h()) {
            aVar3.C();
        } else {
            EcgReviewActivity ecgReviewActivity = this.f52004a;
            a aVar4 = new a(ecgReviewActivity);
            aVar3.s(419377738);
            n1 a11 = j6.a.a(aVar3);
            if (a11 != null) {
                i6.c cVar = new i6.c();
                cVar.a(q0.b(p.class), aVar4);
                i6.b b10 = cVar.b();
                if (a11 instanceof u) {
                    aVar2 = ((u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                g1 a12 = j6.b.a(p.class, a11, null, b10, aVar2, aVar3);
                aVar3.J();
                h.b((p) a12, new b(ecgReviewActivity), new c(ecgReviewActivity), new d(ecgReviewActivity), aVar3, 8);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        return y.f85009a;
    }
}
