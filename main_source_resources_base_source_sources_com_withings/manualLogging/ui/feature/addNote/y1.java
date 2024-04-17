package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: SelectManualLogCategoryScreen.kt */
/* loaded from: classes4.dex */
final class y1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f41633a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y1(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
        super(2);
        this.f41633a = pVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f41633a;
            if (pVar != null) {
                pVar.invoke(aVar2, 0);
            }
        }
        return nm0.y.f85009a;
    }
}
