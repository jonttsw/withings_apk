package com.withings.wiscale2.activity.workout.ui.detail;

import android.graphics.Bitmap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostWorkoutActivity.kt */
/* loaded from: classes4.dex */
public final class b1 extends kotlin.jvm.internal.w implements ym0.l<Bitmap, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PostWorkoutActivity f49121a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(PostWorkoutActivity postWorkoutActivity) {
        super(1);
        this.f49121a = postWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        kotlin.jvm.internal.u.j(bitmap2, "bitmap");
        PostWorkoutActivity postWorkoutActivity = this.f49121a;
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(postWorkoutActivity), Dispatchers.getIO(), null, new a1(postWorkoutActivity, bitmap2, null), 2, null);
        return nm0.y.f85009a;
    }
}
