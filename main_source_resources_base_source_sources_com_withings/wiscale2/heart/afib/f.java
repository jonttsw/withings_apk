package com.withings.wiscale2.heart.afib;

import android.content.Context;
import android.view.View;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: AFibDetailFragment.kt */
/* loaded from: classes5.dex */
final class f extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f57144a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar) {
        super(1);
        this.f57144a = eVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        e eVar = this.f57144a;
        Context requireContext = eVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        String string = eVar.getString(C1987R.string._HELP_CENTER_);
        String string2 = eVar.getString(C1987R.string.afib_learnMore_url);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        eVar.startActivity(HMWebActivity.a.a(aVar, requireContext, "url", string, string2, 16));
        return nm0.y.f85009a;
    }
}
