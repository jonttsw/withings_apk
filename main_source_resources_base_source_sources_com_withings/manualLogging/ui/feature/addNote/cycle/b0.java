package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f40917a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f40918b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.compose.ui.platform.k4 k4Var, ym0.a<nm0.y> aVar) {
        super(0);
        this.f40917a = k4Var;
        this.f40918b = aVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.compose.ui.platform.k4 k4Var = this.f40917a;
        if (k4Var != null) {
            k4Var.a();
        }
        this.f40918b.invoke();
        return nm0.y.f85009a;
    }
}
