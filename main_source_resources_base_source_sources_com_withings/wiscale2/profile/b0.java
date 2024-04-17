package com.withings.wiscale2.profile;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59286a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(q qVar) {
        super(1);
        this.f59286a = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        ProfileTargetView profileTargetView;
        int i11;
        boolean booleanValue = bool.booleanValue();
        profileTargetView = this.f59286a.f59436t;
        if (profileTargetView != null) {
            if (booleanValue) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            profileTargetView.setVisibility(i11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("profileTargetView");
        throw null;
    }
}
