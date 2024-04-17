package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleTutorialIntroductionScreen.kt */
/* loaded from: classes4.dex */
final class f extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f40992a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(3);
        this.f40992a = str;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.c LabelValueCell = cVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelValueCell, "$this$LabelValueCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            nk.a.d(null, this.f40992a, 0L, null, 0, 0, null, aVar2, 0, 125);
        }
        return nm0.y.f85009a;
    }
}
