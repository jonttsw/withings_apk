package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f41073a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(ym0.l<? super Integer, nm0.y> lVar) {
        super(1);
        this.f41073a = lVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        this.f41073a.invoke(Integer.valueOf(num.intValue()));
        return nm0.y.f85009a;
    }
}
