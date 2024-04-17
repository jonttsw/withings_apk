package com.withings.discourse;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: DiscourseActivity.kt */
/* loaded from: classes3.dex */
final class a extends w implements l<DiscourseOption[], y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DiscourseActivity f37976a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DiscourseActivity discourseActivity) {
        super(1);
        this.f37976a = discourseActivity;
    }

    @Override // ym0.l
    public final y invoke(DiscourseOption[] discourseOptionArr) {
        DiscourseOption[] discourseOptionArr2 = discourseOptionArr;
        if (discourseOptionArr2 != null) {
            DiscourseActivity.C3(this.f37976a, discourseOptionArr2);
        }
        return y.f85009a;
    }
}
