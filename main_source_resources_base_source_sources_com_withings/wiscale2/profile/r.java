package com.withings.wiscale2.profile;

import android.content.Context;
import com.withings.badge.list.BadgesActivity;
import com.withings.user.User;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class r extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59460a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar) {
        super(0);
        this.f59460a = qVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        User R1;
        int i11 = BadgesActivity.f32793e;
        q qVar = this.f59460a;
        Context requireContext = qVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        R1 = qVar.R1();
        qVar.startActivity(BadgesActivity.a.a(requireContext, R1.q()));
        return nm0.y.f85009a;
    }
}
