package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
import org.joda.time.DateTime;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class q extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f46011a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DateTime f46012b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f46013c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46014d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f46015e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.l<DateTime, nm0.y> f46016f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f46017g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(String str, DateTime dateTime, String str2, ym0.a<nm0.y> aVar, ym0.l<? super String, nm0.y> lVar, ym0.l<? super DateTime, nm0.y> lVar2, ym0.a<nm0.y> aVar2) {
        super(4);
        this.f46011a = str;
        this.f46012b = dateTime;
        this.f46013c = str2;
        this.f46014d = aVar;
        this.f46015e = lVar;
        this.f46016f = lVar2;
        this.f46017g = aVar2;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(1959883004);
        ym0.l<String, nm0.y> lVar = this.f46015e;
        boolean K = aVar2.K(lVar);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new p(lVar);
            aVar2.n(t11);
        }
        aVar2.J();
        q0.f(this.f46011a, this.f46012b, this.f46013c, this.f46014d, (ym0.a) t11, this.f46016f, this.f46017g, aVar2, 64, 0);
        return nm0.y.f85009a;
    }
}
