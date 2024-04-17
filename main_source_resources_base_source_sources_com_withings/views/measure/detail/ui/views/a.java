package com.withings.views.measure.detail.ui.views;

import android.widget.TextView;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
/* compiled from: DataView.kt */
/* loaded from: classes4.dex */
final class a extends w implements ym0.a<TextView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DataView f46489a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DataView dataView) {
        super(0);
        this.f46489a = dataView;
    }

    @Override // ym0.a
    public final TextView invoke() {
        return (TextView) this.f46489a.findViewById(C1987R.id.data_label);
    }
}
