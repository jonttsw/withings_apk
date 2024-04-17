package com.withings.wiscale2.partner.ui.fitdataviewer;

import android.content.Intent;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FitViewerDataTypesActivity.kt */
/* loaded from: classes5.dex */
final class a extends w implements ym0.l<FitType, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDataTypesActivity f59051a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FitViewerDataTypesActivity fitViewerDataTypesActivity) {
        super(1);
        this.f59051a = fitViewerDataTypesActivity;
    }

    @Override // ym0.l
    public final y invoke(FitType fitType) {
        FitType it = fitType;
        u.j(it, "it");
        FitViewerDataTypesActivity fitViewerDataTypesActivity = this.f59051a;
        fitViewerDataTypesActivity.startActivity(new Intent(fitViewerDataTypesActivity, FitViewerDetailActivity.class).putExtra("fitType", it));
        return y.f85009a;
    }
}
