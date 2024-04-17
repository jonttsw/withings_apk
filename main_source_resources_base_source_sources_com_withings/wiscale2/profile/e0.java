package com.withings.wiscale2.profile;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59316a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(q qVar) {
        super(1);
        this.f59316a = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        ProfileUsersView profileUsersView;
        int i11;
        boolean booleanValue = bool.booleanValue();
        profileUsersView = this.f59316a.f59439w;
        if (profileUsersView != null) {
            if (booleanValue) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            profileUsersView.setVisibility(i11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("profileUsersView");
        throw null;
    }
}
