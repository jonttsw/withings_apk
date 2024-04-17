package com.withings.authentication.mfa.resolve;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f32067a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<c> f32068b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f32069c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<c, nm0.y> f32070d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32071e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32072f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32073g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f32074h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(b bVar, List<? extends c> list, boolean z5, ym0.l<? super c, nm0.y> lVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
        super(2);
        this.f32067a = bVar;
        this.f32068b = list;
        this.f32069c = z5;
        this.f32070d = lVar;
        this.f32071e = aVar;
        this.f32072f = aVar2;
        this.f32073g = aVar3;
        this.f32074h = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f32074h | 1);
        ym0.a<nm0.y> aVar2 = this.f32072f;
        ym0.a<nm0.y> aVar3 = this.f32073g;
        i.c(this.f32067a, this.f32068b, this.f32069c, this.f32070d, this.f32071e, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
