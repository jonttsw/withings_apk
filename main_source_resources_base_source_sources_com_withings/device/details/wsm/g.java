package com.withings.device.details.wsm;

import ah.z;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wsm02DetailFragment.kt */
/* loaded from: classes3.dex */
final class g extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f37320a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f37321b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, i iVar) {
        super(0);
        this.f37320a = context;
        this.f37321b = iVar;
    }

    @Override // ym0.a
    public final y invoke() {
        Intent b10;
        Context context = this.f37320a;
        String string = context.getString(C1987R.string.sleepApnea_onboarding_url_document);
        u.i(string, "getString(...)");
        Uri parse = Uri.parse(string);
        i iVar = this.f37321b;
        ch.d dVar = iVar.f36826l;
        if (dVar != null) {
            b10 = ((z) dVar.m()).b(context, parse, true, new HMWebViewDelegate());
            iVar.startActivity(b10);
            return y.f85009a;
        }
        u.s("intentBuilder");
        throw null;
    }
}
