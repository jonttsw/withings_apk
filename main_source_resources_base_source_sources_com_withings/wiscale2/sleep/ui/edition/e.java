package com.withings.wiscale2.sleep.ui.edition;

import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.sleep.ui.edition.NightEditionActivity;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class e extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NightEditionActivity.g f60476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NightEditionActivity.g gVar) {
        super(0);
        this.f60476a = gVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f60476a.f60462b, "EXTRA_SLEEP_TRACK"));
    }
}
