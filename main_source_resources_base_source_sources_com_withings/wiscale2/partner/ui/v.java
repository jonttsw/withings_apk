package com.withings.wiscale2.partner.ui;

import com.withings.wiscale2.partner.ui.PartnerActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PartnerActivity.g f59225a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(PartnerActivity.g gVar) {
        super(0);
        this.f59225a = gVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.D(this.f59225a.f58884b, "EXTRA_PARTNER_ID"));
    }
}
