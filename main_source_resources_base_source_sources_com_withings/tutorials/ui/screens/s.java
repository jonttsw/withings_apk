package com.withings.tutorials.ui.screens;

import androidx.compose.material3.j5;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.withings.user.core.models.User;
import i6.a;
import nm0.y;
/* compiled from: SegmentalBodyComposition.kt */
/* loaded from: classes4.dex */
final class s extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Long f46209a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f46210b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f46211c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Long l5, ym0.a<y> aVar, ym0.a<y> aVar2) {
        super(4);
        this.f46209a = l5;
        this.f46210b = aVar;
        this.f46211c = aVar2;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        i6.a aVar2;
        androidx.compose.runtime.a aVar3 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar3.s(1890788296);
        n1 a11 = j6.a.a(aVar3);
        if (a11 != null) {
            fk0.c a12 = e6.a.a(a11, aVar3);
            aVar3.s(1729797275);
            if (a11 instanceof androidx.lifecycle.u) {
                aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
            } else {
                aVar2 = a.C1058a.f71431b;
            }
            g1 a13 = j6.b.a(SegmentalBodyCompositionTutorialViewModel.class, a11, null, a12, aVar2, aVar3);
            aVar3.J();
            aVar3.J();
            SegmentalBodyCompositionTutorialViewModel segmentalBodyCompositionTutorialViewModel = (SegmentalBodyCompositionTutorialViewModel) a13;
            segmentalBodyCompositionTutorialViewModel.k0(this.f46209a);
            g.f45305a.c((User.BodyModel) segmentalBodyCompositionTutorialViewModel.j0().getValue(), this.f46210b, new r(segmentalBodyCompositionTutorialViewModel, this.f46211c), aVar3, 3072);
            return y.f85009a;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
