package com.withings.ecg.details;

import android.content.Context;
import android.view.View;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.ecg.details.b0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f38344a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b0.a f38345b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g gVar, b0.a aVar) {
        super(1);
        this.f38344a = gVar;
        this.f38345b = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        g gVar = this.f38344a;
        Context requireContext = gVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        String string = gVar.getString(this.f38345b.f());
        kotlin.jvm.internal.u.i(string, "getString(...)");
        gVar.startActivity(aVar.c(requireContext, null, string));
        return nm0.y.f85009a;
    }
}
