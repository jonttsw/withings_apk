package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class d0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f41445a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41446b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(r8.n nVar, AddManualLogActivity addManualLogActivity) {
        super(0);
        this.f41445a = nVar;
        this.f41446b = addManualLogActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        r8.n nVar = this.f41445a;
        if (nVar.E() == null) {
            this.f41446b.finish();
        } else {
            nVar.N();
        }
        return nm0.y.f85009a;
    }
}
