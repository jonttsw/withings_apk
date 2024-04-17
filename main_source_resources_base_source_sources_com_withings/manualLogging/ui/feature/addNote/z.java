package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class z extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41634a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AddManualLogActivity addManualLogActivity) {
        super(1);
        this.f41634a = addManualLogActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        Boolean bool2 = bool;
        kotlin.jvm.internal.u.g(bool2);
        if (bool2.booleanValue()) {
            this.f41634a.finish();
        }
        return nm0.y.f85009a;
    }
}
