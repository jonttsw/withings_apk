package com.withings.manualLogging.ui.feature.addNote.cycle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTutorialLogWatchScreen.kt */
/* loaded from: classes4.dex */
public final class p4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f41169a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41170b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41171c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41172d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(int i11, int i12, ym0.a aVar, ym0.a aVar2) {
        super(2);
        this.f41169a = i11;
        this.f41170b = aVar;
        this.f41171c = aVar2;
        this.f41172d = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f41172d | 1);
        ym0.a<nm0.y> aVar2 = this.f41170b;
        ym0.a<nm0.y> aVar3 = this.f41171c;
        q4.a(this.f41169a, g11, aVar, aVar2, aVar3);
        return nm0.y.f85009a;
    }
}
