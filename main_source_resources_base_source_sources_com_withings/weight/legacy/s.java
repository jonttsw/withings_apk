package com.withings.weight.legacy;

import androidx.fragment.app.FragmentActivity;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: WeightDetailFragment.kt */
/* loaded from: classes4.dex */
final class s extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f47082a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(n nVar) {
        super(0);
        this.f47082a = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        n nVar = this.f47082a;
        FragmentActivity requireActivity = nVar.requireActivity();
        kotlin.jvm.internal.u.i(requireActivity, "requireActivity(...)");
        String string = nVar.getString(C1987R.string._LEARN_MORE_);
        String string2 = nVar.getString(C1987R.string._BODY_COMPOSITION_DISTRIBUTION_LEARN_MORE_URL_);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        nVar.startActivity(aVar.c(requireActivity, string, string2));
        return nm0.y.f85009a;
    }
}
