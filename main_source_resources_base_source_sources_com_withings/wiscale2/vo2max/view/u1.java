package com.withings.wiscale2.vo2max.view;

import android.widget.ImageView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2maxHeader.kt */
/* loaded from: classes5.dex */
public final class u1 extends kotlin.jvm.internal.w implements ym0.a<ImageView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2maxHeaderView f62839a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(Vo2maxHeaderView vo2maxHeaderView) {
        super(0);
        this.f62839a = vo2maxHeaderView;
    }

    @Override // ym0.a
    public final ImageView invoke() {
        return (ImageView) this.f62839a.f62673b.findViewById(C1987R.id.vo2max_value_view);
    }
}
