package com.withings.discourse;

import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import ym0.l;
/* compiled from: DiscourseActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements l<j<? extends String, ? extends Integer>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DiscourseActivity f37977a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DiscourseActivity discourseActivity) {
        super(1);
        this.f37977a = discourseActivity;
    }

    @Override // ym0.l
    public final y invoke(j<? extends String, ? extends Integer> jVar) {
        j<? extends String, ? extends Integer> jVar2 = jVar;
        if (jVar2 != null) {
            int intValue = jVar2.d().intValue();
            int i11 = DiscourseActivity.f37969c;
            this.f37977a.requestPermissions(new String[]{jVar2.c()}, intValue);
        }
        return y.f85009a;
    }
}
