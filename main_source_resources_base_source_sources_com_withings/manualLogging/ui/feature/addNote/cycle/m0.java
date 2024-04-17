package com.withings.manualLogging.ui.feature.addNote.cycle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f41096a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41097b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41098c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41099d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g3 f41100e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f41101f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41102g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41103h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i11, int i12, a0 a0Var, g3 g3Var, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, ym0.l lVar) {
        super(2);
        this.f41096a = a0Var;
        this.f41097b = aVar;
        this.f41098c = aVar2;
        this.f41099d = aVar3;
        this.f41100e = g3Var;
        this.f41101f = lVar;
        this.f41102g = i11;
        this.f41103h = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f41102g | 1);
        this.f41096a.g(g11, this.f41103h, aVar, this.f41100e, this.f41097b, this.f41098c, this.f41099d, this.f41101f);
        return nm0.y.f85009a;
    }
}
