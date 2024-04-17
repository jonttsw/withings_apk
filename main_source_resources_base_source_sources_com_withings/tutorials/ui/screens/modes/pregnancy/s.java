package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
import org.joda.time.DateTime;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class s extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f46124a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DateTime f46125b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46126c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f46127d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<DateTime, nm0.y> f46128e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46129f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(String str, DateTime dateTime, ym0.a<nm0.y> aVar, ym0.l<? super String, nm0.y> lVar, ym0.l<? super DateTime, nm0.y> lVar2, ym0.a<nm0.y> aVar2) {
        super(4);
        this.f46124a = str;
        this.f46125b = dateTime;
        this.f46126c = aVar;
        this.f46127d = lVar;
        this.f46128e = lVar2;
        this.f46129f = aVar2;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(1959883459);
        ym0.l<String, nm0.y> lVar = this.f46127d;
        boolean K = aVar2.K(lVar);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new r(lVar);
            aVar2.n(t11);
        }
        aVar2.J();
        q0.c(this.f46124a, this.f46125b, this.f46126c, (ym0.a) t11, this.f46128e, this.f46129f, aVar2, 64, 0);
        return nm0.y.f85009a;
    }
}
