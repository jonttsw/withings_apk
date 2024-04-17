package com.withings.healthplus.explore.ui.activity;

import androidx.compose.material3.j5;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class d extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f40302a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.p<Integer, Integer, nm0.y> f40303b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f40304c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f40305d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(ym0.a<nm0.y> aVar, ym0.p<? super Integer, ? super Integer, nm0.y> pVar, long j5, long j11) {
        super(4);
        this.f40302a = aVar;
        this.f40303b = pVar;
        this.f40304c = j5;
        this.f40305d = j11;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        long j5 = this.f40305d;
        av.a.a(this.f40302a, this.f40303b, this.f40304c, j5, null, aVar, 0, 16);
        return nm0.y.f85009a;
    }
}
