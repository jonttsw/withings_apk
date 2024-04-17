package com.withings.discourse;

import android.content.Intent;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import ym0.l;
/* compiled from: DiscourseActivity.kt */
/* loaded from: classes3.dex */
final class c extends w implements l<j<? extends Intent, ? extends Integer>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DiscourseActivity f37978a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DiscourseActivity discourseActivity) {
        super(1);
        this.f37978a = discourseActivity;
    }

    @Override // ym0.l
    public final y invoke(j<? extends Intent, ? extends Integer> jVar) {
        y yVar;
        j<? extends Intent, ? extends Integer> jVar2 = jVar;
        if (jVar2 != null) {
            Intent c11 = jVar2.c();
            Integer d11 = jVar2.d();
            int i11 = DiscourseActivity.f37969c;
            DiscourseActivity discourseActivity = this.f37978a;
            discourseActivity.getClass();
            if (d11 != null) {
                discourseActivity.startActivityForResult(c11, d11.intValue());
                yVar = y.f85009a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                discourseActivity.startActivity(c11);
            }
        }
        return y.f85009a;
    }
}
