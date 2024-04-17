package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;
/* compiled from: ToiletNavigation.kt */
/* loaded from: classes5.dex */
final class t extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f55457a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r8.n nVar) {
        super(1);
        this.f55457a = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        r8.n nVar = this.f55457a;
        if (booleanValue) {
            kotlin.jvm.internal.u.j(nVar, "<this>");
            androidx.navigation.e.L(nVar, "large_toilet_arms_size", null, 6);
        } else {
            kotlin.jvm.internal.u.j(nVar, "<this>");
            androidx.navigation.e.L(nVar, "medium_toilet_arms_size", null, 6);
        }
        return nm0.y.f85009a;
    }
}
