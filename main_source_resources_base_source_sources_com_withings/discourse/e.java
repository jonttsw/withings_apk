package com.withings.discourse;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: DiscourseActivity.kt */
/* loaded from: classes3.dex */
final class e extends w implements l<String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DiscourseActivity f37980a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DiscourseActivity discourseActivity) {
        super(1);
        this.f37980a = discourseActivity;
    }

    @Override // ym0.l
    public final y invoke(String str) {
        String str2 = str;
        if (str2 != null) {
            DiscourseActivity.D3(this.f37980a, str2);
        }
        return y.f85009a;
    }
}
