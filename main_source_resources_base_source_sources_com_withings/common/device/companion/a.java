package com.withings.common.device.companion;

import androidx.fragment.app.m0;
import com.withings.common.device.companion.CompanionLinkExplanationFragment;
import com.withings.common.device.companion.g;
import com.withings.devicesetup.ui.LottieData;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: CompanionLinkActivity.kt */
/* loaded from: classes3.dex */
final class a extends w implements ym0.l<g.b, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CompanionLinkActivity f35091a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CompanionLinkActivity companionLinkActivity) {
        super(1);
        this.f35091a = companionLinkActivity;
    }

    @Override // ym0.l
    public final y invoke(g.b bVar) {
        CompanionLinkExplanationFragment.Content content;
        CompanionLinkExplanationFragment.Content lottie;
        g.b bVar2 = bVar;
        boolean z5 = bVar2 instanceof g.b.C0457b;
        CompanionLinkActivity companionLinkActivity = this.f35091a;
        if (z5) {
            g.a a11 = ((g.b.C0457b) bVar2).a();
            fn0.k<Object>[] kVarArr = CompanionLinkActivity.f35061e;
            m0 m11 = companionLinkActivity.getSupportFragmentManager().m();
            CompanionLinkExplanationFragment.a aVar = CompanionLinkExplanationFragment.f35069f;
            int c11 = a11.c();
            int a12 = a11.a();
            Object b10 = a11.b();
            if (b10 instanceof Integer) {
                lottie = new CompanionLinkExplanationFragment.Content.ImageRes(((Number) a11.b()).intValue());
            } else if (b10 instanceof String) {
                lottie = new CompanionLinkExplanationFragment.Content.ImageUrl((String) a11.b());
            } else if (b10 instanceof LottieData) {
                lottie = new CompanionLinkExplanationFragment.Content.Lottie(((LottieData) a11.b()).a(), ((LottieData) a11.b()).b());
            } else {
                content = null;
                CompanionLinkExplanationFragment.Explanation explanation = new CompanionLinkExplanationFragment.Explanation(c11, a12, content, C1987R.string._NEXT_, null);
                aVar.getClass();
                CompanionLinkExplanationFragment a13 = CompanionLinkExplanationFragment.a.a(explanation);
                a13.v1(new d(companionLinkActivity));
                y yVar = y.f85009a;
                m11.l(C1987R.id.content, a13, null);
                m11.g();
            }
            content = lottie;
            CompanionLinkExplanationFragment.Explanation explanation2 = new CompanionLinkExplanationFragment.Explanation(c11, a12, content, C1987R.string._NEXT_, null);
            aVar.getClass();
            CompanionLinkExplanationFragment a132 = CompanionLinkExplanationFragment.a.a(explanation2);
            a132.v1(new d(companionLinkActivity));
            y yVar2 = y.f85009a;
            m11.l(C1987R.id.content, a132, null);
            m11.g();
        } else if (bVar2 instanceof g.b.c) {
            fn0.k<Object>[] kVarArr2 = CompanionLinkActivity.f35061e;
            m0 m12 = companionLinkActivity.getSupportFragmentManager().m();
            m12.l(C1987R.id.content, new zk.b(), null);
            m12.g();
        } else if (bVar2 instanceof g.b.d) {
            fn0.k<Object>[] kVarArr3 = CompanionLinkActivity.f35061e;
            m0 m13 = companionLinkActivity.getSupportFragmentManager().m();
            CompanionLinkExplanationFragment.a aVar2 = CompanionLinkExplanationFragment.f35069f;
            CompanionLinkExplanationFragment.Explanation explanation3 = new CompanionLinkExplanationFragment.Explanation(C1987R.string.setup_companionLinkSuccess_title, C1987R.string.setup_companionLinkSuccess_description, new CompanionLinkExplanationFragment.Content.ImageRes(2131231327), C1987R.string._DONE_, null);
            aVar2.getClass();
            CompanionLinkExplanationFragment a14 = CompanionLinkExplanationFragment.a.a(explanation3);
            a14.v1(new e(companionLinkActivity));
            y yVar3 = y.f85009a;
            m13.l(C1987R.id.content, a14, null);
            m13.g();
        } else if (bVar2 instanceof g.b.a) {
            fn0.k<Object>[] kVarArr4 = CompanionLinkActivity.f35061e;
            m0 m14 = companionLinkActivity.getSupportFragmentManager().m();
            CompanionLinkExplanationFragment.a aVar3 = CompanionLinkExplanationFragment.f35069f;
            CompanionLinkExplanationFragment.Explanation explanation4 = new CompanionLinkExplanationFragment.Explanation(C1987R.string.setup_companionLinkFailure_title, C1987R.string.setup_companionLinkFailure_description, new CompanionLinkExplanationFragment.Content.ImageRes(2131232398), C1987R.string._DONE_, null);
            aVar3.getClass();
            CompanionLinkExplanationFragment a15 = CompanionLinkExplanationFragment.a.a(explanation4);
            a15.v1(new c(companionLinkActivity));
            y yVar4 = y.f85009a;
            m14.l(C1987R.id.content, a15, null);
            m14.g();
        } else if (bVar2 == null) {
            fn0.k<Object>[] kVarArr5 = CompanionLinkActivity.f35061e;
            m0 m15 = companionLinkActivity.getSupportFragmentManager().m();
            m15.l(C1987R.id.content, new zk.b(), null);
            m15.g();
        }
        return y.f85009a;
    }
}
