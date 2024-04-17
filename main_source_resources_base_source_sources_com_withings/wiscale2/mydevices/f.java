package com.withings.wiscale2.mydevices;

import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyDevicesFragment.kt */
/* loaded from: classes5.dex */
public final class f extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f58654a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f58655b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ vi.o f58656c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f58657d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q qVar, c cVar, vi.o oVar, int i11) {
        super(2);
        this.f58654a = qVar;
        this.f58655b = cVar;
        this.f58656c = oVar;
        this.f58657d = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f58657d | 1);
        c cVar = this.f58655b;
        vi.o oVar = this.f58656c;
        q.v1(this.f58654a, cVar, oVar, aVar, g11);
        return y.f85009a;
    }
}
