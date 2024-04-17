package com.withings.healthplus.explore.ui.activity;

import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.withings.healthplus.explore.ui.viewmodel.NutritionSheetViewModel;
import i6.a;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f40294a = new s1.a(false, -500572570, C0533a.f40295a);

    /* compiled from: ExploreTabActivity.kt */
    /* renamed from: com.withings.healthplus.explore.ui.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0533a extends kotlin.jvm.internal.w implements ym0.r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0533a f40295a = new kotlin.jvm.internal.w(4);

        @Override // ym0.r
        public final nm0.y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
            i6.a aVar2;
            r0.h bottomSheet = hVar;
            androidx.navigation.d it = dVar;
            androidx.compose.runtime.a aVar3 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(bottomSheet, "$this$bottomSheet");
            kotlin.jvm.internal.u.j(it, "it");
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
                g1 a13 = j6.b.a(NutritionSheetViewModel.class, a11, null, a12, aVar2, aVar3);
                aVar3.J();
                aVar3.J();
                ju.v.b((ou.a) a13, aVar3, 8, 0);
                return nm0.y.f85009a;
            }
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
    }
}
