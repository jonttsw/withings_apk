package com.withings.ecg.details;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.p<o2, o2, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f38269a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z5) {
        super(2);
        this.f38269a = z5;
    }

    @Override // ym0.p
    public final Boolean invoke(o2 o2Var, o2 o2Var2) {
        boolean z5;
        o2 oldValue = o2Var;
        o2 newValue = o2Var2;
        kotlin.jvm.internal.u.j(oldValue, "oldValue");
        kotlin.jvm.internal.u.j(newValue, "newValue");
        if (this.f38269a && newValue.b().size() == oldValue.b().size()) {
            z5 = false;
        } else {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
