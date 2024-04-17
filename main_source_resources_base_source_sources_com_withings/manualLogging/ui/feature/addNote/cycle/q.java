package com.withings.manualLogging.ui.feature.addNote.cycle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f41173a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41174b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41175c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41176d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f41177e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41178f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41179g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41180h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i11, int i12, a0 a0Var, g3 g3Var, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, ym0.l lVar) {
        super(2);
        this.f41173a = a0Var;
        this.f41174b = g3Var;
        this.f41175c = aVar;
        this.f41176d = aVar2;
        this.f41177e = lVar;
        this.f41178f = aVar3;
        this.f41179g = i11;
        this.f41180h = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f41179g | 1);
        this.f41173a.a(g11, this.f41180h, aVar, this.f41174b, this.f41175c, this.f41176d, this.f41178f, this.f41177e);
        return nm0.y.f85009a;
    }
}
