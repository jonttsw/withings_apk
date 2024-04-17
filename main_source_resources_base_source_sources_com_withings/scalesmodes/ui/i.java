package com.withings.scalesmodes.ui;

import ah.o;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScalesModeComposable.kt */
/* loaded from: classes4.dex */
public final class i extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f43934a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f43935b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f43936c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f43937d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f43938e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, androidx.compose.ui.e eVar, ym0.a<y> aVar, int i11, int i12) {
        super(2);
        this.f43934a = cVar;
        this.f43935b = eVar;
        this.f43936c = aVar;
        this.f43937d = i11;
        this.f43938e = i12;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f43937d | 1);
        androidx.compose.ui.e eVar = this.f43935b;
        ym0.a<y> aVar2 = this.f43936c;
        j.d(this.f43934a, eVar, aVar2, aVar, g11, this.f43938e);
        return y.f85009a;
    }
}
