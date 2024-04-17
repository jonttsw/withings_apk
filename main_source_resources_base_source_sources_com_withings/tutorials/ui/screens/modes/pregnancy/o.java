package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
import com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f45997a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DueDateMethod f45998b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45999c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f46000d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<DueDateMethod, nm0.y> f46001e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46002f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(String str, DueDateMethod dueDateMethod, ym0.a<nm0.y> aVar, ym0.l<? super String, nm0.y> lVar, ym0.l<? super DueDateMethod, nm0.y> lVar2, ym0.a<nm0.y> aVar2) {
        super(4);
        this.f45997a = str;
        this.f45998b = dueDateMethod;
        this.f45999c = aVar;
        this.f46000d = lVar;
        this.f46001e = lVar2;
        this.f46002f = aVar2;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(1959882497);
        ym0.l<String, nm0.y> lVar = this.f46000d;
        boolean K = aVar2.K(lVar);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new n(lVar);
            aVar2.n(t11);
        }
        aVar2.J();
        q0.b(this.f45997a, this.f45998b, null, this.f45999c, (ym0.a) t11, this.f46001e, this.f46002f, aVar2, 0, 4);
        return nm0.y.f85009a;
    }
}
