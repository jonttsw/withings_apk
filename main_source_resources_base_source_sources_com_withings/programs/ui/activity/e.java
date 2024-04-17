package com.withings.programs.ui.activity;

import android.content.Context;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ProgramOverviewActivity.kt */
/* loaded from: classes4.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ProgramOverviewActivity f43764a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ProgramOverviewActivity programOverviewActivity) {
        super(0);
        this.f43764a = programOverviewActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        ProgramOverviewActivity programOverviewActivity = this.f43764a;
        ch.d dVar = programOverviewActivity.f43744e;
        if (dVar != null) {
            ah.c o11 = dVar.o();
            Context applicationContext = programOverviewActivity.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            o11.getClass();
            programOverviewActivity.startActivity(ah.c.a(applicationContext));
            return y.f85009a;
        }
        u.s("intentBuilder");
        throw null;
    }
}
