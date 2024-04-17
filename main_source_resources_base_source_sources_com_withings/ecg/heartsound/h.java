package com.withings.ecg.heartsound;

import android.content.Context;
import android.view.View;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.ecg.model.HeartDiagnosticUI;
import com.withings.ecg.model.HeartDiagnosticUIKt;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
final class h extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f38472a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HeartDiagnosticUI f38473b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, HeartDiagnosticUI heartDiagnosticUI) {
        super(1);
        this.f38472a = dVar;
        this.f38473b = heartDiagnosticUI;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = it.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        int staticUrl = HeartDiagnosticUIKt.getStaticUrl(this.f38473b, true);
        d dVar = this.f38472a;
        String string = dVar.getString(staticUrl);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        dVar.startActivity(aVar.c(context, null, string));
        return nm0.y.f85009a;
    }
}
