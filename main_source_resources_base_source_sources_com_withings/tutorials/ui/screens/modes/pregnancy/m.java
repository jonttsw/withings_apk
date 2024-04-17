package com.withings.tutorials.ui.screens.modes.pregnancy;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
import org.joda.time.DateTime;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class m extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f45971a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DateTime f45972b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45973c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f45974d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45975e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.l<DateTime, nm0.y> f45976f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45977g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(String str, DateTime dateTime, ym0.a<nm0.y> aVar, ym0.l<? super String, nm0.y> lVar, ym0.a<nm0.y> aVar2, ym0.l<? super DateTime, nm0.y> lVar2, ym0.a<nm0.y> aVar3) {
        super(4);
        this.f45971a = str;
        this.f45972b = dateTime;
        this.f45973c = aVar;
        this.f45974d = lVar;
        this.f45975e = aVar2;
        this.f45976f = lVar2;
        this.f45977g = aVar3;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(1959881981);
        ym0.l<String, nm0.y> lVar = this.f45974d;
        boolean K = aVar2.K(lVar);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new l(lVar);
            aVar2.n(t11);
        }
        aVar2.J();
        q0.a(this.f45971a, this.f45972b, this.f45973c, (ym0.a) t11, this.f45975e, this.f45976f, this.f45977g, aVar2, 64, 0);
        return nm0.y.f85009a;
    }
}
