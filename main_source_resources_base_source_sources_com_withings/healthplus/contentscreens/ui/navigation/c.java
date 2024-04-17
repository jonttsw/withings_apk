package com.withings.healthplus.contentscreens.ui.navigation;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import androidx.lifecycle.u;
import com.withings.healthplus.contentscreens.ui.model.PlayerState;
import com.withings.healthplus.contentscreens.ui.viewmodel.ContentWorkoutPlayerViewModel;
import i6.a;
import k1.r0;
import kotlin.jvm.internal.w;
import lu.n0;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class c extends w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f40142a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<vk.a, y> f40143b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(ym0.a<y> aVar, ym0.l<? super vk.a, y> lVar) {
        super(4);
        this.f40142a = aVar;
        this.f40143b = lVar;
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
            if (a11 instanceof u) {
                aVar2 = ((u) a11).getDefaultViewModelCreationExtras();
            } else {
                aVar2 = a.C1058a.f71431b;
            }
            g1 a13 = j6.b.a(ContentWorkoutPlayerViewModel.class, a11, null, a12, aVar2, aVar3);
            aVar3.J();
            aVar3.J();
            ContentWorkoutPlayerViewModel contentWorkoutPlayerViewModel = (ContentWorkoutPlayerViewModel) a13;
            r0 a14 = h6.b.a(contentWorkoutPlayerViewModel.q0(), 0, aVar3, 56);
            r0 a15 = h6.b.a(contentWorkoutPlayerViewModel.r0(), PlayerState.None.INSTANCE, aVar3, 56);
            String G0 = contentWorkoutPlayerViewModel.G0();
            PlayerState playerState = (PlayerState) a15.getValue();
            Integer num2 = (Integer) a14.getValue();
            aVar3.s(-2038895858);
            boolean K = aVar3.K(contentWorkoutPlayerViewModel);
            Object t11 = aVar3.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new b(contentWorkoutPlayerViewModel);
                aVar3.n(t11);
            }
            aVar3.J();
            ym0.l<vk.a, y> lVar = this.f40143b;
            n0.a(G0, playerState, num2, this.f40142a, lVar, (ym0.l) t11, aVar3, 0);
            return y.f85009a;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
