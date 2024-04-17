package com.withings.wiscale2.bodytemperature.data;

import android.content.Context;
import android.view.View;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: BodyTemperatureMeasureDetailScreen.kt */
/* loaded from: classes4.dex */
final class a extends w implements l<View, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DefinitionView f50298a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DefinitionView definitionView) {
        super(1);
        this.f50298a = definitionView;
    }

    @Override // ym0.l
    public final y invoke(View view) {
        View it = view;
        u.j(it, "it");
        DefinitionView definitionView = this.f50298a;
        Context context = definitionView.getContext();
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context2 = definitionView.getContext();
        u.i(context2, "getContext(...)");
        String string = definitionView.getContext().getString(C1987R.string._TM_SETTINGS_INFO_FEVER_URL_);
        u.i(string, "getString(...)");
        context.startActivity(aVar.c(context2, null, string));
        return y.f85009a;
    }
}
