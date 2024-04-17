package com.withings.survey.ui;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y50.a f44355a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(y50.a aVar) {
        super(2);
        this.f44355a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String b10 = this.f44355a.b();
            if (b10 == null) {
                b10 = "";
            }
            nk.a0.i(0, 0, 29, 0L, aVar2, null, null, b10);
        }
        return nm0.y.f85009a;
    }
}
