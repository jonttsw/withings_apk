package com.withings.discourse;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: DiscourseActivity.kt */
/* loaded from: classes3.dex */
final class d extends w implements l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DiscourseActivity f37979a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DiscourseActivity discourseActivity) {
        super(1);
        this.f37979a = discourseActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        if (bool != null) {
            this.f37979a.finish();
        }
        return y.f85009a;
    }
}
