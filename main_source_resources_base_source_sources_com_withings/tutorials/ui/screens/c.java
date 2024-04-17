package com.withings.tutorials.ui.screens;

import androidx.compose.material3.j5;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import com.withings.device.Device;
import i6.a;
import nm0.y;
/* compiled from: MultipleUsers.kt */
/* loaded from: classes4.dex */
final class c extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Device f45070a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45071b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45072c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r8.n f45073d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Device device, ym0.a<y> aVar, ym0.a<y> aVar2, r8.n nVar) {
        super(4);
        this.f45070a = device;
        this.f45071b = aVar;
        this.f45072c = aVar2;
        this.f45073d = nVar;
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
            g1 a13 = j6.b.a(SetupScaleForMultipleUsersViewModel.class, a11, null, a12, aVar2, aVar3);
            aVar3.J();
            aVar3.J();
            a aVar4 = a.f44812a;
            aVar4.e((SetupScaleForMultipleUsersViewModel) a13, this.f45070a, this.f45071b, this.f45072c, new b(this.f45073d), aVar3, 196680);
            return y.f85009a;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
